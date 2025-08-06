/* Suppose a magazine costs RM5 each if at least 5 units of magazines are purchases and RM7
each otherwise. Calculate the price a customer must pay after he enters the quantity of the
magazines */

#include <iostream>
using namespace std;

int main(){
    int quantity;
    float price, total;

    cout << "\nPlease enter the quantity of magazine: ";
    cin >> quantity;

    if (quantity >= 5){
        price = 5;
        cout << "The price of a magazine is RM" << price << endl;
        total = quantity * price;
        cout << "Your total is RM" << total << endl;
    }
    else{
        price = 7;
        cout << "The price of a magazine is RM" << price << endl;
        total = quantity * price;
        cout << "Your total is RM" << total << endl;
    }

    return 0;
}
