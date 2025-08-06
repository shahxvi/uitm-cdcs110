#include <iostream>
#include <cctype>
#include <iomanip>

float calcPrice(int cakes, int cookies);

int main() {
        char orderType = 'A';
        int cakes = 0, cookies = 0;
        float totalPrice = 0;

        std::cout << "D'Cookies Self-Order Machine\n"
                  << "=====================================================\n";

        while (orderType != 'X') {
                std::cout << "Enter order type (A - Cake, B - Cookies, X - Exit): ";
                std::cin >> orderType;
                orderType = std::toupper(orderType);

                if (orderType == 'A')
                        cakes++;
                if (orderType == 'B')
                        cookies++;

                totalPrice = calcPrice(cakes, cookies);
        }
       
        std::cout << std::fixed << std::showpoint << std::setprecision(2);
        std::cout << "\nOrder Summary:\n"
                  << "=====================================================\n"
                  << "Total cakes: " << cakes
                  << "\nTotal cookies: " << cookies
                  << "\nTotal price: RM" << totalPrice
                  << "=====================================================\n";
}

float calcPrice(int cakes, int cookies) {
        return (cakes + cookies) * 10.90;
}