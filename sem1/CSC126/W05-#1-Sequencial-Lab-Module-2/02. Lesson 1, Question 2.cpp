#include <iostream>
#include <string.h>
using namespace std;

int main(){

    char employeeName[30];
    int totalHours;

    // input employee name, number of hours per month
    // program displays employeeName, number of weeks, days, hours worked

    cout << "Enter employee's name: ";
    cin.getline(employeeName, 30);

    cout << "Enter number of hours worked in a month: ";
    cin >> totalHours;

    int weeks = totalHours / 40;
    int remainingHours = totalHours % 40;
    int days = remainingHours / 8;
    int hours = remainingHours % 8;

    cout << "Employee Name: " << employeeName << endl;
    cout << "Total time worked: " << weeks << " weeks, " << days << " days, " << hours << " hours." << endl;
}