#include <iostream>
#include <iomanip>
using namespace std;

int main(){

    int code;
    float a, b, h;
    float areaOfTriangle, areaOfRectangle, areaOfEllipse, areaOfSquare, areaOfTrapezoid;
    const float TT = 3.142;

    cout << "\n----- Geometric Calculator -----" << endl;
    cout << "Menu Option";
    cout << "\n1. Area of Triangle" << endl;
    cout << "2. Area of Rectangle" << endl;
    cout << "3. Area of Ellipse" << endl;
    cout << "4. Area of Square" << endl;
    cout << "5. Area of Trapezoid" << endl;

    cout << "Enter the code of the shape you want to calculate the area for: ";
    cin >> code;

    cout << fixed << showpoint << setprecision(2);

    switch (code){
        case 1:
            cout << "Enter the base of the triangle, b: ";
            cin >> b;
            cout << "Enter the height of the triangle, h: ";
            cin >> h;
            areaOfTriangle = (1/2.0) * b * h;
            cout << "The area of the triangle is: " << areaOfTriangle << endl;
            break;
        case 2:
            cout << "Enter the length of the rectangle, a: ";
            cin >> a;
            cout << "Enter the width of the rectangle, b: ";
            cin >> b;
            areaOfRectangle = a * b;
            cout << "The area of the rectangle is: " << areaOfRectangle << endl;
            break;
        case 3:
            cout << "Enter the length of the ellipse, a: ";
            cin >> a;
            cout << "Enter the width of the ellipse, b: ";
            cin >> b;
            areaOfEllipse = TT * a * b;
            cout << "The area of the ellipse is: " << areaOfEllipse << endl;
            break;
        case 4:
            cout << "Enter the length of the square, a: ";
            cin >> a;
            areaOfSquare = a * a;
            cout << "The area of the square is: " << areaOfSquare << endl;
            break;
        case 5:
            cout << "Enter the length of the trapezoid, a: ";
            cin >> a;
            cout << "Enter the width of the trapezoid, b: ";
            cin >> b;
            cout << "Enter the height of the trapezoid, h: ";
            cin >> h;
            areaOfTrapezoid = (1/2) * (a + b) * h;
            cout << "The area of the trapezoid is: " << areaOfTrapezoid << endl;
            break;
        default:
            cout << "Invalid code. Please enter a number between 1 and 5." << endl;
            break;
    }
}