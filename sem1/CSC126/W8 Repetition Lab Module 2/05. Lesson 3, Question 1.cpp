#include <iostream>
#include <string.h>
using namespace std;

int main() {
	
    char name[30], smartestStudent[30];
    float mark = 0, total, average;
    float highestMark = 0, lowestMark = 100, highestAverage = 0,failedCount = 0;

    for (int students = 0; students < 3; students++) {      //outerLoop for students
    	
        cout << "\nEnter student name: ";
        cin >> ws;
        cin.getline(name, 30);

        total = 0; //Reset total mark for each student

        for (int subject = 1; subject < 5; subject++) {     //innerLoop for subjects
        	
            cout << "Enter the mark for subject " << (subject) << ": ";
            cin >> mark;
            total += mark;

            if (mark > highestMark) {
                highestMark = mark;
            }

            if (mark < lowestMark) {
                lowestMark = mark;
            }
        }

        average = total / 4.0;
    
        if (average > highestAverage) {
            highestAverage = average;
            strcpy(smartestStudent, name); // Store the name of the smartest student
        }
        
        if (average < 50) {
            failedCount++; // Count the number of students who failed
        }

        cout << "\nThe average mark for " << name << " is: " << average << endl;
        cout << "\nThe highest mark for " << name << " is: " << highestMark << endl;
        cout << "The lowest mark for " << name << " is: " << lowestMark << endl;
    }

    //1 - find and disply the lowest and highest mark for each student
    //line 41 & 42

    //2 - find and display the name of the smartest student (highest average)
    // Note: This requires storing the highest average and corresponding student name.
    cout << "\nThe smartest student is " << smartestStudent << "who has an average of " << highestAverage << endl;

    //3 - count & display the number of that failed (average < 50)
    // Note: This requires checking the average for each student.
    cout << "\nThe number of students who failed is: " << failedCount << endl;

}