#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;          

    int nums[n];
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    int tar;
    cin >> tar;        

    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (nums[i] + nums[j] == tar) {
                cout << i << "," << j;
                return 0;
            }
        }
    }
    
    return 0;
}
