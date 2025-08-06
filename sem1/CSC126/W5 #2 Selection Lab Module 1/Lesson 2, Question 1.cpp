/* Question:
Kurnia Sdn. Bhd. has decided to increase the staff salary and attendance allowance by 12% and 5% respectively if the salary is less than RM1, 500.
Write a program in C++ that can determine whether the salary input is less than RM1, 500 or not. If it is, the staff salary and the attendance allowance
will be updated by 12% and 5% respectively.
*/

#include <iostream>
#include <iomanip>
using namespace std;

int main(){
    
    float salary, allowance;
    
    cout << "\nEnter your current salary: RM";
    cin >> salary;
    
    cout << "Enter your current attendance allowance: RM";
    cin >> allowance;
    
    if (salary < 1500){
        
        salary *= 1.12;
        allowance *= 1.05;
        
        cout << fixed << showpoint;
        cout << "\nYour new salary is RM" << setprecision(2) <<salary << endl;
        cout << "Your new allowance is RM" << setprecision(2) << allowance << endl; 
    }
    
    return 0;
}

