#include <iostream>
using namespace std;

float length, width, perimeter, area;

int main(){
	cout << "\nPlease enter the length rectangle: ";
	cin >> length;

	cout << "\nPlease neter the width rectangle: ";
	cin >> width;

    perimeter = 2 * (length + width);
    area = length * width;

    cout << "\nThe perimeter is " << perimeter;
    cout << "\nThe area is " << area;

    return 0;
}
