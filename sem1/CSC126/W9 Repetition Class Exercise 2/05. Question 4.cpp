#include <iostream>
using namespace std;

int main() {

    int i = 1, score = 0, score1 = 0, score2 = 0, score3 = 0, score4 = 0, score5 = 0;
    int validScore = 0, invalidScore = 0;
    int correspondent = 0, correspondentsValid = 0, correspondentsInvalid = 0;

    cout << "\nHigh Marks Confidence Survey" << endl;
    cout << "Please enter your score for each question." << endl;

    while (i == 1) {
        cout << "\nFrom 1 to 5 (least to most likely) of getting a high marks for any programming subject: ";
        cin >> score;

        if (score >= 1 && score <= 5) {
            switch (score) {
                case 1:
                    score1++;
                    break;
                case 2:
                    score2++;
                    break;
                case 3:
                    score3++;
                    break;
                case 4:
                    score4++;
                    break;
                case 5:
                    score5++;
                    break;
            }
            
            validScore++;
            correspondentsValid++;
            correspondent++;

            cout << "Continue for another correspondent? (1 for Yes, 0 for No): ";
            cin >> i;
        
        }

        else {
            cout << "Invalid score. Please enter a score between 1 and 5." << endl;
            invalidScore++;
            correspondentsInvalid++;
        }
    } 
    
    cout << "Number of respondents that answered 1: " << score1 << endl;
    cout << "Number of respondents that answered 2: " << score2 << endl;
    cout << "Number of respondents that answered 3: " << score3 << endl;
    cout << "Number of respondents that answered 4: " << score4 << endl;
    cout << "Number of respondents that answered 5: " << score5 << endl;

    cout << "\nTotal correspondents: " << correspondent << endl;
    cout << "Average score result: " << (score1 + score2 + score3 + score4 + score5) / correspondent << endl;

    cout << endl;
    system("pause");
    return 0;
}