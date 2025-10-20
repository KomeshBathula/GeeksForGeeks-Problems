// User function Template for Java
class Solution {
    static String checkFibonacci(int n) {
        // code here
        if(n==0||n==1) return "Yes";
        int a = 0, b = 1, c = 0;
        while(c<=n){
            c = a+b;
            if(c==n) return "Yes";
            a = b;
            b = c;
        }
        return "No";
    }
}
