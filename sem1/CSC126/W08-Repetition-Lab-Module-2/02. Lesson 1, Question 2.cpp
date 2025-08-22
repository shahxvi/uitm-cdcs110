#include <iostream>
#include <string.h>
using namespace std;

int main() {

/*Initialize total to 0 
Initialize customer to ‘Y’ 
While there is still customer 
    Input quantity 
    Input price 
    Accumulate total 
    Continue for another customer? 
    Input customer 
Display total paid by all customers 
*/

    int total = 0;
    char customer[2] = "Y";
    int quantity;
    float price;
    float totalPaid = 0;

    while (strcmp(customer, "Y") == 0 || strcmp(customer, "y") == 0) {
        cout << "Enter quantity: ";
        cin >> quantity;
        cout << "Enter price: ";
        cin >> price;

        total += quantity * price;
        cout << "The total for this customer is: " << quantity * price << endl;

        cout << "Continue for another customer? (Y/N): ";
        cin.ignore();
        cin.getline(customer, 2);

    }
    
}