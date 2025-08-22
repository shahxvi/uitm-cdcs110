#include <iostream>
#include <cstring>
#include <iomanip>
using namespace std;

int main() {

    char category, size;
    char itemcode[5], name[13];
    int quantity;
    float price, totalPrice;

    //Input
    cout << "\nEnter the category of flower & plants (D / L): ";
    cin >> category;

    cout << "Enter the item code (D001, D002, L001, L002): ";
    cin.ignore();
    cin.getline(itemcode, 5);

    cout << "Enter the size of the flower & plants (S, M or L): ";
    cin >> size;

    cout << "Enter the quantity: ";
    cin >> quantity;

    //Process
    //D category
    if (category == 'D' || category == 'd') {
        
        //D001 - Birah
        if (strcmp (itemcode, "D001") == 0) {
            strcpy(name, "Birah");

            switch (size) {
                case 'S':
                case 's':
                    price = 20;
                    break;
                case 'M':
                case 'm':
                    price = 90;
                    break;
                case 'L':
                case 'l':
                    price = 150;
                    break;
                default:
                    cout << "\nInvalid size" << endl;
                    return 0;
            }
        }

        //D002 - Bongsai
        else if (strcmp(itemcode, "D002") == 0) {
            strcpy(name, "Bongsai");

            switch (size) {
                case 'S':
                case 's':
                    price = 70;
                    break;
                case 'M':
                case 'm':
                    price = 100;
                    break;
                case 'L':
                case 'l':
                    price = 150;
                    break;
                default:
                    cout << "\nInvalid size" << endl;
                    return 0;
            }
        }

        //Invalid item code
        else {
            cout << "\nInvalid item code";
            return 0;
        }
    }

    //L category
    else if (category == 'L' || category == 'l') {
        
        //L001 - Pinang Merah
        if (strcmp(itemcode, "L001") == 0) {
            strcpy(name, "Pinang Merah");
            
            switch (size) {
                case 'S':
                case 's':
                    price = 30;
                    break;
                case 'M':
                case 'm':
                    price = 60;
                    break;
                case 'L':
                case 'l':
                    price = 120;
                    break;
                default:
                    cout << "\nInvalid size" << endl;
                    return 0;
            }
        }
        
        //L002 - Pagoda
        else if (strcmp(itemcode, "L002") == 0) {
            strcpy(name, "Pagoda");
            
            switch (size) {
                case 'S':
                case 's':
                    price = 25;
                    break;
                case 'M':
                case 'm':
                    price = 35;
                    break;
                case 'L':
                case 'l':
                    price = 45;
                    break;
                default:
                    cout << "\nInvalid size" << endl;
                    return 0;
            }
        }
        
        //Invalid item code
        else {
            cout << "\nInvalid item code" << endl;
            return 0;
        }
    }

    //Invalid category
    else {
        cout << "\nInvalid category" << endl;
        return 0;
    }

    totalPrice = price * quantity;


    //Output
    cout << fixed << showpoint << setprecision(2);
    cout << "\n" << itemcode << " - " << name << endl;
    cout << "Size: " << size << endl;
    cout << "Quantity: " << quantity << endl;
    cout << "\nPrice: RM" << price << endl;
    cout << "Total Price: RM" << totalPrice << endl;
}
