#include <iostream>
using namespace std;

int main() {
        int num;

        cout << "Enter a number: ";
        cin >> num;
        
        for (int i = num; i > 0; i--) {

                if ((num % 5 == 0) && (num % 2 != 0)) {
                        cout << i << " ";
                }
        }
        cout << endl;
        system("pause");
}