#include <iostream>
#include <cstring>
#include <iomanip>
using namespace std;

int main(){

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
    if (category == 'D' || category == 'd'){
        if (strcmp (itemcode, "D001") == 0){
            strcpy(name, "Birah");
            if (size == 'S' || size == 's')
                price = 20;
            else if (size == 'M' || size == 'm')
                price = 90;
            else if (size == 'L' || size == 'l')
                price = 150;
            else{
                cout << "\nInvalid size";
                return 0;
            }
        }
        else if (strcmp(itemcode, "D002") == 0){
            strcpy(name, "Bongsai");
            if (size == 'S' || size == 's')
                price = 70;
            else if (size == 'M' || size == 'm')
                price = 100;
            else if (size == 'L' || size == 'l')
                price = 150;
            else{
                cout << "\nInvalid size";
                return 0;
            }
        }
        else{
            cout << "\nInvalid item code";
            return 0;
        }
    }

    else if (category == 'L' || category == 'l'){
        if (strcmp(itemcode, "L001") == 0){
            strcpy(name, "Pinang Merah");
            if (size == 'S' || size == 's')
                price = 30;
            else if (size == 'M' || size == 'm')
                price = 60;
            else if (size == 'L' || size == 'l')
                price = 120;
            else{
                cout << "\nInvalid size";
                return 0;
            }
        }
        else if (strcmp(itemcode, "L002") == 0){
            strcpy(name, "Pagoda");
            if (size == 'S' || size == 's')
                price = 25;
            else if (size == 'M' || size == 'm')
                price = 35;
            else if (size == 'L' || size == 'l')
                price = 45;
            else{
                cout << "\nInvalid size";
                return 0;
            }
        }
        else{
            cout << "\nInvalid item code";
            return 0;
        }
    }

    else{
        cout << "\nInvalid category";
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
