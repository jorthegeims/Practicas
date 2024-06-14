#include <iostream>
#include <string>
#include <vector>
#include <boost/asio.hpp>

using namespace std;
using namespace boost::asio;

class LedDisplay {
public:
    LedDisplay(const string& port, unsigned int baud_rate) 
        : io(), serial(io, port) {
        serial.set_option(serial_port_base::baud_rate(baud_rate));
        serial.set_option(serial_port_base::character_size(8));
        serial.set_option(serial_port_base::parity(serial_port_base::parity::none));
        serial.set_option(serial_port_base::stop_bits(serial_port_base::stop_bits::one));
    }

    void sendMessage(const string& message) {
        if (message.size() > 15) {
            cerr << "Mensaje demasiado largo" << endl;
            return;
        }

        // Construir la trama
        vector<uint8_t> frame = buildFrame(message);

        // Enviar la trama
        write(serial, buffer(frame));
    }

private:
    io_service io;
    serial_port serial;
    static uint8_t sequence_number;

    vector<uint8_t> buildFrame(const string& message) {
        vector<uint8_t> frame;

        frame.push_back(0x01); // SOH
        frame.push_back('L');  // Tipo Mensaje
        frame.push_back(0x02); // STX

        // Secuencia
        frame.push_back(sequence_number >> 8); 
        frame.push_back(sequence_number & 0xFF);
        sequence_number++;

        // Largo del Mensaje
        frame.push_back(0x00); 
        frame.push_back(message.size());

        // Mensaje
        for (char c : message) {
            frame.push_back(c);
        }

        // Calcular y añadir el checksum
        uint8_t checksum = GetChecksum(message.c_str());
        frame.push_back(checksum);

        frame.push_back(0x03); // ETX

        return frame;
    }

};

// Inicializar el número de secuencia
uint8_t LedDisplay::sequence_number = 0;

int main() {
    try {
        LedDisplay display("COM1", 9600);
        display.sendMessage("Hello, World!");
    } catch (const std::exception& e) {
        cerr << "Exception: " << e.what() << endl;
    }
    return 0;
}
