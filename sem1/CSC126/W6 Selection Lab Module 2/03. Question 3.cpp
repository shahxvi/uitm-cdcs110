#include <iostream>
using namespace std;

int main(){
    float amount, discount;

    cout << "Enter the amount: RM";
    cin >> amount;

    if(amount >= 300 && amount < 1000)
        discount = 0.055;
    if(amount > 1000)
        discount = 0.065;

    float payment_after_discount = amount - (amount * discount);

    cout << "The payment after discount is RM" << payment_after_discount << endl;

}