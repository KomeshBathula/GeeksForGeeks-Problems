class Solution {
    static boolean isPrime(int n) {
        // code here
        if(n<=1) return false;
        int count = 0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0) count++;
        }
        if(count==1) return true;
        return false;
    }
}