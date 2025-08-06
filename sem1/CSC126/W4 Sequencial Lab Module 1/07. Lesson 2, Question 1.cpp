#include <iostream>
#include <math.h>
using namespace std;

#define PI 3.13159

int main(){

	float volume, radius;
	cout << "\n----- Volume of Sphere Calculator ------" << endl;

	cout << "Enter the value of the sphere's radius: ";
	cin >> radius;

	volume = (4.0/3.0) * PI * pow(radius, 3);
	
	cout << "Volume of Sphere: " << volume << endl;

	return 0;

}
