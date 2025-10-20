#include<iostream>
#include<cmath>
using namespace std;

int main() {
    int n, original, sum = 0;
    cout << "Enter a number: ";
    cin >> n;

    original = n;


    int digits = 0;
    int temp = n;
    while(temp != 0) {
        temp = temp / 10;
        digits++;
    }

  
    temp = n;
    while(temp != 0) {
        int rem = temp % 10;
        sum += pow(rem, digits);   
        temp = temp / 10;
    }


    if(sum == original) {
        cout << original << " is an Armstrong number." << endl;
    } else {
        cout << original << " is NOT an Armstrong number." << endl;
    }

    return 0;
}
