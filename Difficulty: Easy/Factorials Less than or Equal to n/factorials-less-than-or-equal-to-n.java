// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> al = new ArrayList<>();
        long fact = 1;
        for(long i=1;i<=n;i++){
            fact*=i;
            if(fact<=n) al.add(fact);
            else break;
        }
        return al;
    }
}