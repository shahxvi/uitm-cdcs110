#include <iostream>
using namespace std;

int main()
{
    int no1, no2;

    cout << "Enter the first number (dividend):";
    cin >> no1;

    cout << "Enther the second number (divisor):";
    cin >> no2;

    //compute
    int quotient = no1 / no2;
    cout << "\nQuotient = " << quotient << endl;

    cout << "\nRemainder = " << no1 % no2 << endl;
    return 0;
}
