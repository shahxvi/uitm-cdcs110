#include <iostream>
using namespace std;

int main(){

    float weight_kgs;

    cout << "Enter the weight (in Kilograms): ";
    cin >> weight_kgs;

    float weight_lbs = weight_kgs * 2.2;
    cout << weight_kgs << "kg is equivalent to " << weight_lbs << "lbs" << endl;

    return 0;
}
