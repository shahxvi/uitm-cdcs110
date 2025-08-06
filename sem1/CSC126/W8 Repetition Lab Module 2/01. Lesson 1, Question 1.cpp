#include <iostream>
#include <cstring>
using namespace std;

int main() {

    int number;
    char answer[4] = "Yes";
    int total = 0;
    int count = 0;
    float average;
    int smallestnum = 999999;
    int biggestnum = -999999;
    int numbiggerthan50 = 0;

    while (strcmp(answer, "Yes") == 0 || strcmp(answer, "yes") == 0) {

        cout << "Enter a number: ";
        cin >> number;
        count ++;
        total += number;

        cout << "Do you wish to proceed? (Yes/No): ";
        cin.ignore();
        cin.getline(answer, 4);
        
        if (number < smallestnum)
            smallestnum = number;
        if (number > biggestnum)
            biggestnum = number;
        if (number > 50)
            numbiggerthan50++ ;

    }

    average = float (total) / count;

    cout << endl;
    cout << "\nThe total of all numbers entered is: " << total << endl;
    cout << "\nThe number of inputs is: " << count << endl;
    cout << "\nThe average is: " << average << endl;

    //find & display the smallest no.
    cout << "\nThe smallest number is: " << smallestnum << endl;

    //find & display the largest no.
    cout << "The biggest number is: " << biggestnum << endl;
    //find & display the number of input greater than 50
    cout << "\nNumber of input greater than 50: " << numbiggerthan50 << endl;

}