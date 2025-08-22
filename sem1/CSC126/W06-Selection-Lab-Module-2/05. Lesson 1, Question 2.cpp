#include <iostream>
#include <iomanip>
using namespace std;

int main(){
    char itemCode;

    cout << "Enter the item code: ";
    cin >> itemCode;
;
    float price = 0, charge;
    if (toupper(itemCode) == 'A')
        price = 54, charge = 0.05;
    else if (toupper(itemCode) == 'B')
        price = 65, charge = 0.05;
    else if (toupper(itemCode) == 'C')
        price = 82, charge = 0.05;
    else if (toupper(itemCode) == 'D')
        price = 103, charge = 0.07;
    else if (toupper(itemCode) == 'E')
        price = 150, charge = 0.07;
    else if(toupper(itemCode) == 'F')
        price = 245, charge = 0.010;
    else if(toupper(itemCode) == 'G')
        price = 250, charge = 0.010;
    else
        cout << "\nError, this item is not in the list." << endl;
    
    float totalCharge = price * charge;
    float payment = price + totalCharge;

    if (price > 0){
        cout << fixed << setprecision(2);
        cout << "\nTotal payment is RM" << payment << endl;
    }
    else
        return 0;
}