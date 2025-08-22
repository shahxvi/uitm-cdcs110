#include<iostream>
#include<string.h>
using namespace std;
#define size 30

int main()
{
    //1) input 2 names
    char name1[size], name2[size];

    cout << "Enter the first name: ";
    cin.getline(name1, size);

    cout << "Enter the second name: ";
    cin.getline(name2, size);

    //2) input 2 integer numbers to represent the age of the 2 individuals     
    int age1, age2;
    cout << "Enter the age for the first person: ";
    cin >> age1;

    cout << "Enter the age for the second person: ";
    cin >> age2;


    //3) determine who is older 
    cout<<endl;
    if (age1 > age2)
        cout << name1 << " is older than " << name2 << endl;
    else if (age1 < age2)
        cout << name2 << " is older than " << name1 << endl;
    else
        cout << name1 << " and " << name2 << " are the same age." << endl;

    //4) determine whether the names entered are the same name or not.
    //if the names are not the same, display the longer name.
    if (strcmp(name1, name2) == 0)
        cout << "\nYou have enetered the same name." << endl;
    else
        cout << endl;
        if (strlen(name1) > strlen(name2))
            cout << name1 << " is longer than " << name2 << endl;
        else if (strlen(name1) < strlen(name2))
            cout << name2 << " is longer than " << name1 << endl;
        else
            cout << name1 << " and " << name2 << " are the same length." << endl; 
}
