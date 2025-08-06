#include <iostream>
using namespace std;

int main(){

	const float tax_rate = 0.06;
	float total, total_after_tax;

	cout << "\nEnter you total income: RM";
	cin >> total;

	total_after_tax = total + (total * tax_rate);

	cout << "Your total income after tax: RM" << total_after_tax;

	return 0;

}
