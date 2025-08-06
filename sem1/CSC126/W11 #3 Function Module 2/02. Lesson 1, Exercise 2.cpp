#include<iostream>
using namespace std;

int main()
{
        char input;
        int digit = 0, alpha = 0, none = 0;
    
        for (int counter = 0; counter < 10; counter++) {
                cout << "Enter a symbol: ";
                cin >> input;

                if (isdigit(input))
                        digit++;
                
                else if (isalpha(input))
                        alpha++;

                else
                        none++;
        }
        
        cout << "The number of digits is: " << digit << endl;
        cout << "The number of alphabetic characters is: " << alpha << endl;
        cout << "The number of other characters is: " << none << endl;

        system("pause");
        return 0;
}
