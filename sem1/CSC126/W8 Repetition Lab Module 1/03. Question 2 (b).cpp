#include <iostream>
using namespace std;
int main () {

    int counter = 50;           //LCV & Initialization
    while (counter <= 100) {    //Evaluation & Termination value
        cout << counter << " ";
        counter += 2;           //Update LCV & step size = 2
    }
}