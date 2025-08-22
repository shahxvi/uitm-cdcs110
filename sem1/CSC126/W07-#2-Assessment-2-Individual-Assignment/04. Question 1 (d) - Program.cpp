#include <iostream>
#include <cstring>
using namespace std;

int main() {

    //Initialize variables
    float purchaseAmount, points, additionalPoints, totalPoints;
    char productRating[4], preferredPurchases[4];

    //Input
    cout << "\nEnter the amount of purchases: RM";
    cin >> purchaseAmount;
    cout << "Have you successfully rated a product? (Yes / No): ";
    cin.ignore();
    cin.getline(productRating, 4);
    cout << "Is the purchases made from preferred sellers? (Yes / No): ";
    cin.getline(preferredPurchases, 4);

    //Process
    if (purchaseAmount > 0 && purchaseAmount < 500)
        points = 100;
    else if (purchaseAmount >= 500 && purchaseAmount < 1000)
        points = 300;
    else if (purchaseAmount >= 1000)
        points = 500;
    else 
        points = 0;

    if (strcmp(productRating, "Yes") == 0 || strcmp(productRating, "yes") == 0)
        if (strcmp(preferredPurchases, "Yes") == 0 || strcmp(preferredPurchases, "yes") == 0)
            additionalPoints = 100;
        else
            additionalPoints = 50;
    else
        if (strcmp(preferredPurchases, "Yes") == 0 || strcmp(preferredPurchases, "yes") == 0)
            additionalPoints = 50;
        else
            additionalPoints = 0;

    totalPoints = points + additionalPoints;


    //Output
    if (purchaseAmount <= 0)
        cout << "\nInvalid purchase amount!" << endl;
    else {
        cout << "\nPoints: " << points << endl;
        cout << "Additional points: " << additionalPoints << endl;
        cout << "Total points: " << points << " + " << additionalPoints << " = " <<  totalPoints << endl;
    }

    return 0;

}