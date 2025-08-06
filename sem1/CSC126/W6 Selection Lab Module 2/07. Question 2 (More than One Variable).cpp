#include <iostream>
#include <string.h>
using namespace std;

int main(){
    float cgpa;
    int amount;
    char program[9];

    cout << "\nEnter your program (Diploma / Bachelor): ";
    cin.getline(program, 9);

    if (strcmp(program, "Diploma") == 0 || strcmp(program, "diploma") == 0){
        cout << "Enter your CGPA: ";
        cin >> cgpa;
        if (cgpa < 3.00)
            amount = 5000;
        else
            amount = 7000;
        cout << "\nYour scholarship amount is: RM" << amount << endl;
    }
    else if (strcmp(program, "Bachelor") == 0 || strcmp(program, "bachelor") == 0){
        cout << "Enter your CGPA: ";
        cin >> cgpa;
        if (cgpa < 3.30)
            amount = 6000;
        else
            amount = 10000;
        cout << "\nYour scholarship amount is: RM" << amount << endl;
    }
    else
        cout << "Invalid program entered." << endl;
}
