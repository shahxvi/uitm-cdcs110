// calculate profits from selling customized water bottles
// PRICEPERWATERBOTTLE = 15.00;
#include <iostream>
#include <iomanip>

void input(std::string &customerName, int &nBottles) {
        std::cout << "Enter the customer's name: ";
        std::getline(std::cin, customerName);
        std::cout << "Enter the number of water bottles: ";
        std::cin >> nBottles;
}

float calcCost(int nBottles) {
        if (nBottles < 20) {
                std::cout << "Customer is not allowed to buy less than 20 water bottles!";
                return 0;
        }
        else {
                if (nBottles >= 20 && nBottles <= 29){
                        return nBottles * 40.90;
                }
                if (nBottles >= 30 && nBottles <= 39){
                        return nBottles * 35.95;
                }
                if (nBottles >= 40){
                        return nBottles * 30.90;
                }
        }
}

int main() {
        std::string customerName;
        int nBottles;
        float totalCost;

        input(customerName, nBottles);

        totalCost = calcCost(nBottles);

        std::cout << "\n******PAYMENT DETAILS*****";
        std::cout << "\nCustomer's Name: " << customerName;
        std::cout << std::fixed << std::setprecision(2);
        std::cout << "\nTotal Cost: RM" << totalCost;

        return 0;
}