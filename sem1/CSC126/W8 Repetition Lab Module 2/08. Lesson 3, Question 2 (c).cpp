#include <iostream>
using namespace std;

int main () {
    
    int i, j; // i = row, j = column

    for (i = 1; i <= 5; i++) {
        
        if (i % 2 != 0) {
            
            for (j = 0; j < 5; j++) {
                cout << "@";
            }
            cout << endl;
        }

        else 
            cout << "@" << endl;
    }
}