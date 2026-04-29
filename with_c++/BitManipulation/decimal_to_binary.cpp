#include<iostream>
#include<algorithm>
using namespace std;

string decimal_to_binary_str (int n) {

    string ans = "";

    while (n > 0) {

        ans.append(std::to_string(n % 2));

        n /= 2;

    }
    
    std::reverse(ans.begin(), ans.end());
    
    return ans;

}

void decimal_to_binary_number (long long n) {
    long long bin = 0ll;
    long long i = 1;
    while (n > 0) {
        
        int rem = n % 2;
        
        bin = bin + (i * rem);
        
        i = i * 10;
        n = n >> 1;
        
    }
    
    cout << bin << "\n";
    
}


int main() {
    


    ios::sync_with_stdio(false);
    cin.tie(NULL);


    int n = 0;
    cin >> n;

    cout << decimal_to_binary_str(n);

    

    return 0;
}
