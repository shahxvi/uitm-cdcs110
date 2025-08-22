#include <iostream>

int findSquare(int& num) {
    return num * num;
}

int main() {
        for (int counter = 1; counter <= 50; counter++) {
                std::cout << findSquare (counter) << " ";
        }

        system("pause");
        return 0;
}