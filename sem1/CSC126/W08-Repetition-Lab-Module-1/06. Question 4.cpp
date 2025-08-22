#include <iostream>
using namespace std;

int main () {
    
    //Write a program in C++ that can display how many numbers from 0 to 100 that is divisible by 2 and 5.
    int counter = 0;

    for (int i = 0; i <= 100; i++) {
        if (i % 2 == 0 && i % 5 == 0) {
            counter++;
        }
    }

    cout << "\nThe number of numbers from 0 to 100 that are divisible by 2 and 5 is: " << counter << endl;

    return 0;
}