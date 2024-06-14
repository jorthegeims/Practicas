#include <iostream>
#include <string>
#include <vector>
#include <windows.h>
#include <cstdint> 

using namespace std;

class LedDisplay {
public:
    LedDisplay(const string& port, unsigned int baud_rate) {
        // Configurar la comunicación serial
        hSerial = CreateFile(port.c_str(),
            GENERIC_READ | GENERIC_WRITE,
            0,
            0,
            OPEN_EXISTING,
            FILE_ATTRIBUTE_NORMAL,
            0);

        if (hSerial == INVALID_HANDLE_VALUE) {
            if (GetLastError() == ERROR_FILE_NOT_FOUND) {
                cerr << "Error: " << port << " not available." << endl;
            }
            cerr << "Error: Unable to open " << port << endl;
            exit(EXIT_FAILURE);
        }

        DCB dcbSerialParams = { 0 };
        dcbSerialParams.DCBlength = sizeof(dcbSerialParams);

        if (!GetCommState(hSerial, &dcbSerialParams)) {
            cerr << "Error: Getting device state" << endl;
            exit(EXIT_FAILURE);
        }

        dcbSerialParams.BaudRate = baud_rate;
        dcbSerialParams.ByteSize = 8;
        dcbSerialParams.StopBits = ONESTOPBIT;
        dcbSerialParams.Parity = NOPARITY;

        if (!SetCommState(hSerial, &dcbSerialParams)) {
            cerr << "Error: Setting device parameters" << endl;
            exit(EXIT_FAILURE);
        }
    }

    ~LedDisplay() {
        CloseHandle(hSerial);
    }

    void sendMessage(const string& message) {
        if (message.size() > 15) {
            cerr << "Message too long!" << endl;
            return;
        }

        // Construir la trama
        vector<uint8_t> frame = buildFrame(message);

        // Enviar la trama
        DWORD bytes_written;
        if (!WriteFile(hSerial, frame.data(), frame.size(), &bytes_written, NULL)) {
            cerr << "Error: Writing to serial port" << endl;
        }
    }

private:
    HANDLE hSerial;
    static uint8_t sequence_number;

    vector<uint8_t> buildFrame(const string& message) {
        vector<uint8_t> frame;

        frame.push_back(0x01); // SOH
        frame.push_back('L');  // Tipo Mensaje
        frame.push_back(0x02); // STX

        // Secuencia
        frame.push_back(sequence_number >> 8); // High byte
        frame.push_back(sequence_number & 0xFF); // Low byte
        sequence_number++;

        // Largo del Mensaje
        frame.push_back(0x00); // High byte (always 0 as the message length is <= 15)
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

    // Implementación ficticia de la función de checksum
    uint8_t GetChecksum(const char* pStr) {
        uint8_t checksum = 0;
        while (*pStr) {
            checksum += *pStr++;
        }
        return checksum;
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
