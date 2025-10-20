class Solution {
    public static int gcd(int a, int b) {
        // code here
        while(b%a!=0){
            int r = b%a;
            b = a;
            a = r;
        }
        return a;
    }
}
