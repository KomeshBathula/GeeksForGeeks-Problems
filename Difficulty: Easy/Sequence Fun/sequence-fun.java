class Solution {
    public int NthTerm(int n) {
        // code here
        long k = 2;
        for(int i = 2;i<=n;i++)
            k = (k*i+1) % 1000000007;
        return (int)k;
    }
}