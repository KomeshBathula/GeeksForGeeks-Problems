// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int sum=0,rev;
        while(n!=0){
            rev = n%10;
            sum=sum*10+rev;
            n = n/10;
        }
        return sum;
    }
}