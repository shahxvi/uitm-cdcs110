#include <iostream>
#include <cstring>
using namespace std;

int main() {

    char i[4] = "Yes";
    float number;
    int validTotal = 0;

    cout << endl;
    
    while (strcmp(i, "Yes") == 0 || strcmp(i, "yes") == 0) {
        
        cout << "\nEnter your number: ";
        cin >> number;

        if (number >= 1 && number <= 100) {
            cout << "Your number is valid." << endl;
            validTotal += number;
        }
         
        else
            cout << "Your number is invalid." << endl;

        cout << "\nDo you want to continue? (Yes/No): ";
        cin >> i;
    }

    cout << "\nYou have entered a total of " << validTotal << " valid number" << endl;
}