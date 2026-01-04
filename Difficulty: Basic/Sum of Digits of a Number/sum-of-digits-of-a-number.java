class Solution {
    public static int sumOfDigits(int n) {
        // Code here
        if (n < 10) return n;
        return sumOfDigits(n%10) + sumOfDigits(n/10);
    }
    // private static int getSum(int sum, int n) {
    //     if (n < 0) return sum;
    //     return getSum(n % 10, n / 10);
    // }
}
