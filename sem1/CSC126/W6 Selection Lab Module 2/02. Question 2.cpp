#include <iostream>
using namespace std;

int main(){
    float salesAmount, comission;

    cout << "Enter the amount of sales: RM";
    cin >> salesAmount;

    if (salesAmount > 10000)
        comission = 0.05; //5% commission
    else
        comission = 0.03; //3% commission

    float comissionAmount = salesAmount * comission;
    float totalAmount = salesAmount + comissionAmount;

    cout << "\nThe amount of sales is: RM" << salesAmount << endl;
    cout << "The commission rate is: " << comission << "%" << endl;
    cout << "The commission amount is: RM" << comissionAmount << endl;
    cout << "The total amount is: RM" << totalAmount << endl;

    return 0;
}