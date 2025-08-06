#include <iostream>
using namespace std;

int main(){

    int num1, num2;
    char operation;

    cout << "\nEnter first number: ";
    cin >> num1;
    cout << "Enter second number: ";
    cin >> num2;
    cout << "Enter operation (+, -, *, /, %): ";
    cin >> operation;

    // Using a switch statement, write a program that reads two integers and a character. 
    switch (operation){
        case '+':
            cout << num1 << " " << operation << " " << num2 << " = " << num1 + num2 << endl;
            break;
        case '-':
            cout << num1 << " " << operation << " " << num2 << " = " << num1 - num2 << endl;
            break;
        case '*':
            cout << num1 << " " << operation << " " << num2 << " = " << num1 * num2 << endl;
            break;
        case '/':
            cout << num1 << " " << operation << " " << num2 << " = " << num1 / num2 << endl;
            break;
        case '%':
            cout << num1 << " " << operation << " " << num2 << " = " << num1 % num2 << endl;
            break;
        default:
            cout << operation << " is not a valid operation." << endl;
    }
}