#include <iostream>
using namespace std;

int main(){

    float investment, profit;
    
    cout << "\nEnter the amount of investment: RM";
    cin >> investment;

    cout << "Enter the profit: RM";
    cin >> profit;

    if(investment >= 50000 && profit > 20000)
        cout << "\nThis investment is worhty to continue." << endl;
    else
        cout << "This investment is a waste of money." << endl;

    return 0;

}