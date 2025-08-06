#include <iostream>
using namespace std;

int main(){
    float investment, rate;

    cout << "Enter the amount of investment: RM";
    cin >> investment;

    if (investment <= 5000)
        rate = 0.002;
    else if (investment <= 10000)
        rate = 0.003;
    else if (investment <= 30000)
        rate = 0.008;
    else if (investment <= 50000)
        rate = 0.01;
    else if (investment <= 75000)
        rate = 0.011;
    else
        rate = 0.013;

    cout << "\nTotal dividend is RM" << investment * rate << endl;
}
