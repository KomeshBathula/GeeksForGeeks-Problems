// User function Template for Java
class Solution {
    static String isDeficient(long x) {
        // code here
        int sum = 0;
        for(int i=1;i*i<=x;i++){
            if(x%i==0) {
                sum+=i;
                if(x/i!=i) sum+=x/i;
            }
        }
        if(sum<2*x) return "YES";
        return "NO";
    }
}