// User function Template for Java

class Solution {
    public long total_Money(int n, int k) {
        // code here
        long money = 0;
        for(int pushups = k;pushups<=n;pushups+=k){
            money += pushups;
        }
        return money;
    }
}