#include<iostream> 
using namespace std; 
 
int main() 
{ 
    char name[30]; 
    char gender;
    int countM = 0, countF = 0; 
     
    for(int counter = 0; counter < 5; counter++) 
    { 
        cout<<"Name of the employee: "; 
        cin>>ws; 
        cin.getline(name, 30); 
        cout<<"Gender of the employee (M / F): "; 
        cin>>gender;
            
        gender = toupper(gender);
        if (gender == 'M')
            countM++;
        else
            countF++;
    }
    
    cout << "\nNo. of male employees = " << countM;
    cout << "\nNumber of female employees = " << countF << endl;
    
    system("pause"); 
    return 0; 
} 