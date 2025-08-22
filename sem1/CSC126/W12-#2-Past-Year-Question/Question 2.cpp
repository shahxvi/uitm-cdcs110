// Evaluate student's eligability for scholarships based on their 
//GPA and annual family income

#include <iostream>
void checkScholarship(float gpa, float familyIncome);

int main() {

        float gpa, familyIncome;

        std::cout << "Yayasan Sarawak Kenyalang Scolarship 2025"
                  << "\nPlease enter your Grade Point Average(GPA): ";
        std::cin >> gpa;


        std::cout << "\nPlease enter your annual family income: RM";
        std::cin >> familyIncome;

        checkScholarship(gpa, familyIncome);
}

void checkScholarship(float gpa, float familyIncome) {
        if ((gpa >= 3.8 && gpa <= 4.0) && familyIncome < 50000) {
                std::cout << "You are eligable for Full Scholarship!";
        }
        else if (gpa >= 3.5 && gpa <= 3.8) {
               if (familyIncome < 100000) {
                        std::cout << "You are eligable for Partial Scholarship!";
               }
               else if (familyIncome < 50000){
                        std::cout << "You are eligable for Need-Based Scholarship!";
               }
               else {
                        std::cout << "You are not eligable for scholarships.";
               }
        }
        else {
                std::cout << "You are not eligable for scholarships.";
        }
}