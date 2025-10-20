// User function Template for Java
// User function Template for Java
class Solution {
    static int differenceSeries(int N) {
        // code here
        int ans = 3;
        for(int i = 1;i<N;i++)
            ans += (3+4*i);
        return ans;
    }
}