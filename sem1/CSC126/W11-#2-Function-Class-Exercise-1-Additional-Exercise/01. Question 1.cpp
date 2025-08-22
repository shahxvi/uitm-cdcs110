#include <iostream>
#include <iomanip>

float calcPayment(int packageType, int hour, int guest) {
    float pricePerHour;

    if (packageType < 1 || packageType > 3) {
        std::cout << "Please enter the correct package type:";
        std::cin >> packageType;
    }

    switch(packageType) {
        case 1: pricePerHour = 300; break;
        case 2: pricePerHour = 550; break;
        case 3: pricePerHour = 750; break;
    }
    return (pricePerHour * hour) + (guest * 50);
}

float calcDiscount(float totalPayment) {
    if (totalPayment > 5000)
        return totalPayment * 0.20;
    else
        return totalPayment * 0.10;
}

int main() {
    int numCustomers;
    int customerWithMoreThan100Guests = 0;
    float totalSales = 0;

    std::cout << "Damai Bayu Resort" << std::endl;
    std::cout << "Enter the number of customers: ";
    std::cin >> numCustomers;

    for (int i = 1; i <= numCustomers; ++i) {
        int packageType, hours, guests;

        std::cout << "\nCustomer #" << i << std::endl;
        std::cout << "Please enter your desired package type (1-Pearl, 2-Ruby, 3-Platinum): ";
        std::cin >> packageType;

        std::cout << "Please enter the number of hours spent: ";
        std::cin >> hours;

        std::cout << "Please enter the number of guests: ";
        std::cin >> guests;

        float payment = calcPayment(packageType, hours, guests);
        float discount = calcDiscount(payment);
        float netPayment = payment - discount;

        std::cout << std::fixed << std::setprecision(2);
        std::cout << "Net payment for this customer: RM" << netPayment << std::endl;

        totalSales += netPayment;

        if (guests > 100)
            customerWithMoreThan100Guests++;
    }

    std::cout << "\nThe number of customers with more than 100 guests: " << customerWithMoreThan100Guests << std::endl;
    std::cout << "Total sales for all customers: RM" << std::fixed << std::showpoint << std::setprecision(2) << totalSales << std::endl;
}
