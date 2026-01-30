// User function Template for Java

class Solution {
    // Function to find the maximum element from array arr1 and
    // the minimum element from array arr2 and return their product.
    public long findMultiplication(int[] arr1, int[] arr2) {
        // code here
        int max = arr1[0];
        for (int val : arr1) {
            max = Math.max(val, max);
        }
        int min = arr2[0];
        for (int val : arr2) {
            min = Math.min(val, min);
        }
        return max * min;
    }
}