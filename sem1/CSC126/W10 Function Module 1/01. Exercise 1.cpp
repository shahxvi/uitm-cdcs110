#include <iostream>
using namespace std;

int largestNum(int a, int b) {
	if (a > b)
		return a;
	else
		return b;
}

int smallestNum(int a, int b) {
	if (a < b)
		return a;
	else
		return b;
}

int tot(int, int);
float avg(int, int);

int main () {

	int num1, num2;
	int max, min;

	cout << "Enter the first number: ";
	cin >> num1;

	cout << "Enter the second number: ";
	cin >> num2;

	cout << "\nThe largest number is " << largestNum(num1, num2) << endl;	
	cout << "\nThe smallest number is " << smallestNum(num1, num2) << endl;

	cout << "\nThe total of the 2 numbers is " << tot(num1, num2) << endl;

	cout << "\nThe average of the 2 numbers is " << avg(num1, num2) << endl;

	return 0;
}

int tot(int a, int b) {
	return a + b;
}

float avg(int a, int b) {
	return (a + b) / 2.0;
}

//First ever program written using Vim on Linux Mint
