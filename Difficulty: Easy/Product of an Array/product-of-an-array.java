/*
     arr[] is the array
*/
class Solution {
    public static long product(long arr[]) {
        // your code here
        long prod = 1;
        for (long val : arr) 
            prod = (prod * val) % 1000000007;
        return prod;
    }
}