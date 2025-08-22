#include <iostream>
using namespace std;

int main () {

    int counter  = 25, count = 0, sum = 0;

    do {

        cout << counter << " ";
        sum += counter;
        counter -= 2;
        count++;

    } while (counter >= 10);

    //find & display the sum of all odds
    cout << "\nThe sum of all odds: " << sum << endl;

    //find & display the average of all odds
    float average = (float) sum / count;
    cout << "Average of all odds: " << average << endl;
}