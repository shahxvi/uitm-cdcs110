#include <iostream>
using namespace std;

int main() {

    
    int meter = 1;

    cout << "Meter\t\tInch\t\tCentimeter(cm)" << endl;
    cout << "-----\t\t-----\t\t---------------" << endl;

    while (meter <= 10) {

        float cm = meter * 100;
        float inch = cm / 2.54;

        cout << meter << "\t\t";
        cout << inch << "\t\t";
        cout << cm << endl;
        meter++;

    }
    cout << endl;
    system("pause");
    return 0;
}