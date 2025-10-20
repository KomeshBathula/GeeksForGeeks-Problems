// User function Template for Java
class Solution {
    static int largestPrimeFactor(int n) {
        // code here
        int max = 0;
        while(n%2==0){
            max = 2;
            n = n/2;
        }
        for(int i=3;i*i<=n;i+=2){
            while(n%i==0){
                max = i;
                n = n/i;
            }
        }
        if(n>1){
            max = n;
        }
        return max;
    }
}