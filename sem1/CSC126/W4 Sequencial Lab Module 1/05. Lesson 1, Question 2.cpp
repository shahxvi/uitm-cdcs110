#include <iostream>
using namespace std;

int main() {
    
  float depth_km, celsius, fahrenheit;
    
  cout << "\nEnter the depth (in kilometers) inside the earth: ";
  cin >> depth_km;
    
  celsius = 10 * depth_km + 20;
  fahrenheit = 1.8 * celsius + 32;
    
  cout << "\nThe temperature at depth " << depth_km << "km is:";
  cout << "\nCelcius: " << celsius << " degrees";
  cout << "\nFahrenheit: " << fahrenheit << " degrees"<< endl;
  
  return 0;
}
