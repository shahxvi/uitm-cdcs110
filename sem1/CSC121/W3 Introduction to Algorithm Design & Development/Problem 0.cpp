# include <iostream>
using namespace std;

int main(){

	float value1, value2, sum;
	
	cout << "\nEnter first number: ";
	cin >> value1;
	cout << "\nEnter second number: ";
	cin >> value2;
	
	sum = value1 + value2;
	
	cout << "\nThe sum of " << value1 << " plus " << value2 << " is: " << sum;
	
	return 0;
}
