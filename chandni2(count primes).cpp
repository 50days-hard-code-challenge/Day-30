class Solution {
public:
    int countPrimes(int n) {
        int count=0;
        int prime[5000001]={0};
        for(int i=2;i*i<n;i++){
            if(prime[i]==0){
            for(int j=i*i;j<n;j+=i){
               prime[j]=1;
            }
        }
    }
    for(int i=2;i<n;i++){
        if(prime[i]==0){
            count++;
        }
    }
    return count;
    }
};
