#include <iostream>
using namespace std;

int main () {
    
    //Write a program in C++ that can determine and display the largest and the smallest number among any number of integers entered by the user. 
    
    int i, n, num;
    int total = 0;
    int odd = 0;
    int even = 0;
    
    //Step 1: Initialize
    int largest = -999999; 
    int smallest = 999999; 

    cout << "\nEnter the number of integer(s) you want to enter: ";
    cin >> n;

    cout << endl;

    for (i = 0; i < n; i++) {
        
        cout << "Enter the Number: ";
        cin >> num;

        //Step 2: Compare
        if (num < smallest)
            smallest = num; //Step 3: Upadate
        if (num > largest)
            largest = num; //Step 3: Upadate
        
        if (num % 2 == 0)
            even++;
        else
            odd++;

        total += num;

    }

    //1 - find & display the largest number
    cout << "\nThe smallest number is: " << smallest << endl;
    cout << "The largest number is: " << largest << endl;

    //2 - calculate & display the total of all numbers
    float average = (float) total / n;
    cout << "\nThe average of all numbers is: " << average << endl;

    //3 - find & display the number of odd and even numbers
    cout << "\nThe number of odd numbers is: " << odd << endl;
    cout << "The number of even numbers is: " << even << endl;

    //4 - find & display the average even numbers
    float averageEven = (float) total / even;
    cout << "\nThe average of even numbers is: " << averageEven << endl;
}