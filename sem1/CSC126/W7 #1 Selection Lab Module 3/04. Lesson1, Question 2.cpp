#include <iostream>
#include <string.h>
#include <iomanip>
using namespace std;

int main(){
    
    cout << "\n 1 - APPLE iPhone 5S" << endl;
    cout << " 2 - Samsung Galaxy Note 3" << endl;
    cout << " 3 - Smasung Galaxy Note 2" << endl;
    cout << " 4 - LG Nexus 5 LTE" << endl;
    cout << " 5 - Sony Xperia Z Ultra" << endl;

    char selected_mobile_phone;
    string phone_name;
    float price;

    cout << "\nEnter the selected mobile phone (1, 2, 3, 4 or 5): ";
    cin >> selected_mobile_phone;

    switch (selected_mobile_phone){
        case '1':
            price = 2260;
            phone_name = "APPLE iPhone 5S";
            break;
        case '2':
            price = 2098;
            phone_name = "Samsung Galaxy Note 3";
            break;
        case '3':
            price = 1499;
            phone_name = "Smasung Galaxy Note 2";
            break;
        case '4':
            price = 1579;
            phone_name = "LG Nexus 5 LTE";
            break;
        default:
            price = 1419;
            phone_name = "Sony Xperia Z Ultra";
    }

    float priceAfterDiscount = price * 0.75;

    cout << fixed << setprecision(2);
    cout << "\nYou selected mobile phone " << selected_mobile_phone << " - " << phone_name << endl;
    cout << "The price before discount is RM" << price << endl;
    cout << "The price after discount is RM" << priceAfterDiscount << endl;

}