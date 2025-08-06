#include <iostream>
using namespace std;

// Type 3 function
void summation(int,int); // function prototype // decleration of the function

// Type 1 function
void welcome();

int main() {
        int num1, num2;

        welcome(); // Caller

        cout << "\nEnter the first number: ";
        cin >> num1;

        cout << "Enter the second number: ";
        cin >> num2;

        summation(num1, num2); // Caller

        system("pause"); // Pause the console to view output
        return 0;
}

void welcome() {
        cout << "Welcome to calculator app" << endl;
}

// Function definition
void summation(int a, int b) {
        int sum = a + b;
        cout << "\nThe sum of " << a << " and " << b << " is: " << sum << endl;
}