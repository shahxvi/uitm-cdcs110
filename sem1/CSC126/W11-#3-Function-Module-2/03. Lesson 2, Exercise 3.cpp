#include<iostream>
using namespace std;

void displayValue(int&, int);

int main()
{
    int num = 40;
    int num2 = 45;
    cout<<"Value of num before function call = "<<num<<endl;
    cout<<"Value of num2 before function call = "<<num2<<endl;
    displayValue(num, num2);
    cout<<"\nValue of num after function call = "<<num<<endl; 
    cout<<"Value of num2 after function call = "<<num2<<endl; 
      
    cout<<endl;
    system("pause");
    return 0;
}

void displayValue(int& n, int m)
{
     cout<<"\nOriginal value of n = "<<n<<endl;
     cout<<"Original value of m = "<<m<<endl;
     
     n = n * 2;
     m = m * 3;
     
     cout<<"\nUpdated value of n = "<<n<<endl;
     cout<<"Updated value of m = "<<m<<endl;
}
