// User function Template for Java

class Solution {
    public int multiply(int[] arr) {
        // code here
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length / 2; i++) 
            sum1 += arr[i];
        for (int i = arr.length / 2; i < arr.length; i++) 
            sum2 += arr[i];
        return sum1 * sum2;
    }
}
