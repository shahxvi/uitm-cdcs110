#include <iostream>
#include <cmath>

float sphereVol(float r) {
	return (4/3.0) * M_PI * (r * r * r);
}

int main() {
	float radius;

	std::cout << "Volume of Sphere Calculator\n";
	std::cout << "Please enter the radius of the sphere: ";
	std::cin >> radius;
	
	std::cout << "\nThe volume of the sphere is: " << sphereVol(radius) << std::endl;
	
	return 0;
}
