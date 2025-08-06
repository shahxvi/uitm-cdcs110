#include <iostream>                                             //preprocessor directive
using namespace std;

int main(){
    // 1 - Input
    float yearly_wages, income_tax, monthly_salary, bonus;      //declare variable
    cout << "Please enter your monthly salary: RM";
    cin >> monthly_salary;
    cout << "Please enter your yearly bonus: RM";
    cin >> bonus;                                               // input statement

    // 2 - Process
    yearly_wages = (monthly_salary * 12) + bonus;
    income_tax = 0.03 * yearly_wages;

    // 3 - Output
    cout << "\nYour yearly wages is RM" << yearly_wages <<endl;
    cout << "Your income tax is RM" << income_tax << endl;

    return 0;
}                                                               // {} to group statements together
