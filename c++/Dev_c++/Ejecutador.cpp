#include <iostream>
#include <fstream>
#include <sstream>
#include <vector>
#include <tuple>
#include <iostream>
#include <fstream>
#include <sstream>
#include <vector>
#include <tuple>
#include <cstdlib> 

using namespace std;

int main(int argc, char const *argv[])
{
    printf("no te hagas");
    int c,s,d;
    //std::cin >> c >> s >> d;
    printf("el piola");

    ofstream archivo("ejemplo.dat");
    if (!archivo)
    {
        cout << "Error al abrir ejemplo.dat\n";
        exit(EXIT_FAILURE);
    }

    std::string linea;
    
    std::getline(archivo,linea);

    std::istringstream iss1(linea);
    iss1 >> c >> s >> d;


    

    for (int i = 0; i < 10; ++i)
        archivo << i << endl;

    return 0;
    
}

