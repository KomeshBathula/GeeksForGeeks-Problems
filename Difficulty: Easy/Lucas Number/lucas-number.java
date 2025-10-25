// User function Template for Java

class Solution {
    public long lucas(int n) {
        // code here.
        if(n == 0) return 2;
        if(n == 1) return 1;
        int v[] = new int[n+1];
        v[0] = 2;
        v[1] = 1;
        for(int i = 2;i<=n;i++){
            v[i] = (v[i-2] + v[i-1]) % 1000000007;
        }
        return v[n]%1000000007;
    }
};
