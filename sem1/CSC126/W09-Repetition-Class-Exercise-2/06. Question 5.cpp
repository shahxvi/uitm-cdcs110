#include <iostream>
using namespace std;

int main() {
	int patient = 1;

	float systolic, diastolic;

	float maxDiastolic = -999;
	float minSystolic = 999;
	
	int lowBloodPressure = 0;
	int highBloodPressure = 0;

	float sumSystolic = 0;
	float sumDiastolic = 0;

	float avgSystolic, avgDiastolic;

	for (int i = 0; i < 10; i++) {
		cout << "Enter the systolic for patient " << patient << " : ";
		cin >> systolic;

		cout << "Enter the diastolic for patient " << patient << " : ";
		cin >> diastolic;
		
		cout << endl;

		if (diastolic > maxDiastolic) {
			maxDiastolic = diastolic;
		}

		if (systolic < minSystolic) {
			minSystolic = systolic;
		}
		
		sumSystolic += systolic;
		
		sumDiastolic += diastolic;

		if (systolic < 90 && diastolic < 60) {
			lowBloodPressure++;
		}

		if (systolic > 140 && diastolic > 90) {
			highBloodPressure++;
		}

		patient++;
	}
	
	avgSystolic = sumSystolic / patient;

	avgDiastolic = sumDiastolic / patient;
	
	cout << "\nThe maximum reading of diastolic is: " << maxDiastolic;
	cout << "\nThe minimum reading of systolic is: " << minSystolic;
	cout << "\nThe average reading of systolic is: " << avgSystolic;
	cout << "\nThe average reading of diastolic is: " << avgDiastolic;
	cout << "\nThe number of patients with low blood pressure: " << lowBloodPressure;
	cout << "\nThe number of patients with high blood pressure: " << highBloodPressure << endl;
}

