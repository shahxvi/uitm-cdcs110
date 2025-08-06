#include <iostream>
using namespace std;

int main(){
    int code;
    
    cout<<"Enter the code (1, 2, 3 or 4):";
    cin>>code;
    
    switch (code){
        case 1:
            cout << "Diploma in Computer Science." << endl;
            break;
        case 2:
            cout << "Diploma in Accountancy." << endl;
            break;
        case 3:
            cout << "Diploma in Business Study." << endl;
            break;
        case 4:
            cout << "Diploma in Banking." << endl;
            break;
        default:
            cout << "Invalid code." << endl;
            break;
    }
}

/*if (code == 1)
   cout<<"Diploma in Computer Science."<<endl;
else if (code == 2)
   cout<<"Diploma in Accountacy."<<endl;
else if (code == 3)
   cout<<"Diploma in Business Study."<<endl;
else if (code == 4)
   cout<<"Diploma in Banking."<<endl;
else
    cout<<"Invalid code."<<endl;
   
system("pause");
return 0;*/
