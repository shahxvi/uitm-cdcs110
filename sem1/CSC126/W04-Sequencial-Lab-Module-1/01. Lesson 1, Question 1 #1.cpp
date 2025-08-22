#include <iostream> //cin @ cout
using namespace std;

int main()          //without main function --> compiler cannot compile
{ 
    //declare variables
    float item_price, money;

    cout << "Enter the price of the item: RM";              //instructions to users
    cin >> item_price;                                      //waiting for user input

    cout << "Enter the total payment from the user: RM";    //instructions to users
    cin >> money;                                           //waiting for user input

    //process
    float change = money - item_price;

    //output
    cout << "\nChange for the custormer  = RM" << change << endl;

    return 0;

}                   //to group statements together
