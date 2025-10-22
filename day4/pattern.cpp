#include <iostream>
using namespace std;

int main() {
    int r;
    cout << "Enter the number of Rows: ";
    cin >> r;

    for (int i = 0; i < r; i++) {
        
        for (int j = i; j < r - 1; j++) {
            cout << " ";
        }

     
        for (int k = 0; k <= i; k++) {
            cout << "*";
        }

   
        for (int l = 0; l <= i; l++) {
            cout << "*";
        }

        cout << endl; 
    }

    return 0;
}
