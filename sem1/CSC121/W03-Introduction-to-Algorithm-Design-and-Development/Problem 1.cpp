#include <iostream>
using namespace std;

float cent50_coin = 0.50f, cent20_coin = 0.20f;
int quantity_50cent_coins = 3, quantity_20cent_coins = 5;
float cokePrice = 2.20f;
float payment, balance;

int main() {

    payment = quantity_50cent_coins * cent50_coin + quantity_20cent_coins * cent20_coin;
    
    balance = payment - cokePrice;

    cout << "\nCoke Price: RM" << cokePrice << endl;
    cout << "\nPayment: RM" << payment << endl;
    cout << "\nBalance: RM" << balance << endl;
    cout << "\nHere's Your Coke!" << endl;

    return 0;
}
