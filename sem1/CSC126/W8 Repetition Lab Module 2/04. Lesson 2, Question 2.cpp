#include <iostream>
#include <string.h>
using namespace std;

int main () {

    char gender[7];
    int classSize = 0, student = 1, femaleCount = 0, maleCount = 0;
    
    cout << endl;
    
    while (classSize < 10) {

        cout << "Enter the gender of student " << student << " (Male / Female): ";
        cin >> gender;
        student++;
        classSize++;

        if (strcmp(gender, "Male") == 0 || strcmp(gender, "male") == 0)
            maleCount++;
        
        else if (strcmp(gender, "Female") == 0 || strcmp(gender, "female") == 0)
            femaleCount++;
        
        else 
            cout << "Invalid Input" << endl;
    }

    cout << "\nThe number of male students is: " << maleCount << endl;
    cout << "The number of female students is: " << femaleCount << endl;

}