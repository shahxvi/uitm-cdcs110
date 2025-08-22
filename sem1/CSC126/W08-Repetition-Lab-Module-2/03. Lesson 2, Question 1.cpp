#include <iostream>
using namespace std;

int main() {

    int number;
    int max = -1, min = 9999;
    int counter = 0;

    cout << endl;
    
    while (counter < 5) {
        cout << "Enter a number: ";
        cin >> number;

        if (number > max)
            max = number;
        if (number < min)
            min = number;
        
        counter++;
    }

    cout << "\nMinimum number is " << min << endl;
    cout << "Maximum number is " << max << endl;
    cout << endl;
    system("pause");
    return 0;
}