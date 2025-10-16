// User function Template for Java

class Solution {
    static String isPart(int n) {
        // complete the function here
        if(isPrime(n+2)) return "Yes";
        return "No";
    }
    static boolean isPrime(int n){
        for(int i = 2;i*i<=n;i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}