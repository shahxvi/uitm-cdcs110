#include <iostream>
using namespace std;

float length, width;

int main(){

    cout << "Enter the length of the rectangle: ";
    cin >> length;

    cout << "Enter the width of the rectangle: ";
    cin >> width;

    float perimeter = length * length + width * width;
    float area = length * width;

    cout << "\nThe perimeter of the rectangle is " << perimeter;
    cout << "\nThe area of the rectangle is " << area << endl;

    return 0;
}
