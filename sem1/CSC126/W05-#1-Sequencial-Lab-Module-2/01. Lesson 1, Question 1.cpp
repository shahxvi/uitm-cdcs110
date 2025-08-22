/* Shipping Industries needs a program that allows its shipping staff to enter an item’s name, the quantity of the
item in inventory and how many units of the item can be packed in a box for shipping. The program should
display the item’s name, the number of full boxes that can be packed from the quantity on hand and the quantity
of items left over. */

#include <iostream>
#include <string.h>
using namespace std;

int main(){
    
    char itemName[30];
    int quantity, unit_in_box, packedBox, leftovers;

    cout << "\nEnter item name: ";
    cin.getline(itemName, 30);

    cout << "\nEnter quantity of the item: ";
    cin >> quantity;

    cout << "\nHow many units of the item can be packed in a box for shipping: ";
    cin >> unit_in_box;

    packedBox = quantity / unit_in_box;
    leftovers = quantity % unit_in_box;

    cout << "\nItem Name: " << itemName << endl;
    cout << "Number of full boxes that can be packed from the quantity on hand: " << packedBox << endl;
    cout << "Quantity of items left over: " << leftovers << endl;

return 0;

}
