// User function Template for Java
class Solution {
    static long sumOfTheSeries(long n) {
        // code here
        if(n ==1) return 1L;
        long ans = 0;
        for(int i = 1;i<=n;i++){
            ans += i*i;
        }
        return ans;
    }
}