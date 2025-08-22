#include <iostream>
#include <cstring>
#include <iomanip>
using namespace std;

int main() {

    char category, size;
    char itemcode[5], name[13];
    int quantity;
    float price, totalPrice;

    cout << "\nDecoration (D) / Landscaping (L)" << endl;
    cout << "\nEnter the category of flower & plants (D / L): ";
    cin >> category;

    switch (category) {
        case 'D':
        case 'd':
            cout << "\nD001 - Birah";
            cout << "\nD002 - Bongsai" << endl;
            cout << "\nEnter item code (D001, D002): ";
        break;

        case 'L':
        case 'l':
            cout << "\nL001 - Pinang Merah";
            cout << "\nL002 - Pagoda" << endl;
            cout << "\nEnter item code (L001, L002): ";
        break;

        default:
        cout << "\nInvalid category" << endl;
        return 0;
    }

    cin.ignore();
    cin.getline(itemcode, 5);

    if (strcmp(itemcode, "D001") == 0 || strcmp(itemcode, "d001") == 0) {
        strcpy(name, "Birah");

        cout << "\n" << itemcode << " - " << name << " Price per Size:" << endl;
        cout << "Small (S) =  RM20 | Medium (M) = RM30 | Large (L) = RM45" << endl;
        cout << "\nEnter the size (S, M or L): ";
        cin >> size;

        switch (size) {
        case 'S':
        case 's':
            price = 20.00;
            break;
        case 'M':
        case 'm':
            price = 30.00;
            break;
        case 'L':
        case 'l':
            price = 45.00;
            break;
        default:
            cout << "\nInvalid size" << endl;
            return 0;
        }
    }

    else if (strcmp(itemcode, "D002") == 0 || strcmp(itemcode, "d002") == 0) {
        strcpy(name, "Bongsai");

        cout << "\n" << itemcode << " - " << name << " Price per Size:" << endl;
        cout << "Small (S) =  RM70 | Medium (M) = RM100 | Large (L) = RM150" << endl;
        cout << "\nEnter the size (S, M or L): ";
        cin >> size;
        
        switch (size) {
        case 'S':
        case 's':
            price = 70.00;
            break;
        case 'M':
        case 'm':
            price = 100.00;
            break;
        case 'L':
        case 'l':
            price = 150.00;
            break;
        default:
            cout << "\nInvalid size" << endl;
            return 0;
        }
    }

    else if (strcmp(itemcode, "L001") == 0 || strcmp(itemcode, "l001") == 0) {
        strcpy(name, "Pinang Merah");

        cout << "\n" << itemcode << " - " << name << " Price per Size:" << endl;
        cout << "Small (S) =  RM30 | Medium (M) = RM60 | Large (L) = RM120" << endl;
        cout << "\nEnter the size (S, M or L): ";
        cin >> size;
        
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

    else if (strcmp(itemcode, "L002") == 0 || strcmp(itemcode, "l002") == 0) {
        strcpy(name, "Pagoda");
        
        cout << "\n" << itemcode << " - " << name << " Price per Size:" << endl;
        cout << "Small (S) =  RM25 | Medium (M) = RM35 | Large (L) = RM45" << endl;
        cout << "\nEnter the size (S, M or L): ";
        cin >> size;

        switch (size) {
        case 'S':
        case 's':
            price = 25.00;
            break;
        case 'M':
        case 'm':
            price = 35.00;
            break;
        case 'L':
        case 'l':
            price = 45.00;
            break;
        default:
            cout << "\nInvalid size" << endl;
            return 0;
        }
    }

    else {
        cout << "\nInvalid item code" << endl;
        return 0;
    }


    cout << "\nEnter the quantity: ";
    cin >> quantity;


    totalPrice = price * quantity;

    cout << fixed << showpoint << setprecision(2);
    cout << "\nPrice: RM" << price << endl;
    cout << "Quantity: " << quantity << endl;
    cout << "Total Price: RM" << totalPrice << endl;

    cout << endl;
    system("pause");
    return 0;
}
