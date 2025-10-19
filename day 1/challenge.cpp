#include <iostream>
#include <string>
using namespace std;

int main() {
    int n;
    cout << "Enter the number of strings: ";
    cin >> n;

    string arr[n];
    cout << "Enter the strings:\n";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    int maxLength = 0;

    for (int i = 0; i < n; i++) {
        if (arr[i].length() > maxLength) {
            maxLength = arr[i].length();
        }
    }

    cout << "Length of the longest string: " << maxLength << endl;

    return 0;
}
