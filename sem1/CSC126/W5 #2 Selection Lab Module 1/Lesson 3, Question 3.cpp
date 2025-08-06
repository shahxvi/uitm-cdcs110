#include <iostream>
using namespace std;

int main(){
    
    // Input: performance mark
    int performanceMark, bonus;
    cout << "\nEnter your performance mark (0-10): ";
    cin >> performanceMark;
    
    // Process: determine bonus based on performance mark
    if (performanceMark >= 6)
        bonus = 2500;
    else
    bonus = 1200;
    
    // Output: display the bonus amount
    cout << "Your bonus amount is: RM" << bonus << endl;
    
    return 0;
    
}
