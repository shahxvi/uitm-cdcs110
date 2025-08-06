#include <iostream>
using namespace std;

float pi = 3.142;
float volume, radius;

int main(){
    cout << "\n Please input the sphere's radius: ";
    cin >> radius;

    volume = (4/3.0f) * pi * (radius * radius * radius);
    cout << "\nThe volume of the spehere is: " << volume << endl;
    return 0;
}
