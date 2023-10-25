#include<iostream>
#include<vector>
#include <bits/stdc++.h>
using namespace std;

// Add two numbers represented by two array
vector<int> calc_Sum(int a[],int n,int b[],int m){        
    int i=n-1;
    int j=m-1;
    vector<int> ans;
    int carry = 0;
        
    // Case: 01 Jab i and j both are greater than or equal to 0 honge
    while(i>=0 && j>=0){
        int x = a[i] + b[j] + carry;
        int digit = x % 10;
        // Push digit in ans 
        ans.push_back(digit);
        carry = x / 10;
        i--,j--;
    }
    // Case 02: Jab i greater than or equal to 0 hoga
    while(i>=0){
        int x = a[i] + 0 + carry;
        int digit = x % 10;
        // Push digit in ans 
        ans.push_back(digit);
        carry = x / 10;
        i--;
    }
    // Case 03: Jab j greater than or equal to 0 hoga
    while(j>=0){
        int x = 0 + b[j] + carry;
        int digit = x % 10;
        // Push digit in ans 
        ans.push_back(digit);
        carry = x / 10;
        j--;
    }
    // Case 04: Jab Carry greater than 0 hoga
    if(carry > 0){
        ans.push_back(carry);
    }
    // Case 05: Jab actual ans ke last position par zero ho tab tak use delete karte rahenge
    while(ans[ans.size()-1] == 0){
        ans.pop_back();
    }
    // Actual ans ko reverse krdo correct ans ke liye
    reverse(ans.begin(), ans.end());
    return ans;
}
