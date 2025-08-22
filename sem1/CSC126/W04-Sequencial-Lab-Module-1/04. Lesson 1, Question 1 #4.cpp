#include <iostream>
using namespace std;

int main(){

    float salary1, salary2, salary3;
    float avg;

    cout << "Enter the salary of the first employee: RM";
    cin >> salary1;

    cout << "Enter the salary of the second employee: RM";
    cin >> salary2;

    cout << "Enter the salary of the third employee: RM";
    cin >> salary3;

    avg = (salary1 + salary2 + salary3) / 3;

    cout << "The average is salay of the 3 employees is RM" << avg << endl;

    return 0;
}
