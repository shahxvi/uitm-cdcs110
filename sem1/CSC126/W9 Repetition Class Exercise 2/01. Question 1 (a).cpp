#include <iostream>
using namespace std;

int main() {
    
    int sum = 0, digit = 0;

    while (digit < 10) {
        if (digit % 2 == 0) {
            sum += digit;
        }
        digit++;
    }
    
    cout << sum << endl;

    return 0;
}