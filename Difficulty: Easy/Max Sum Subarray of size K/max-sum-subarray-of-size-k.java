class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) 
            sum += arr[i];
        max = Math.max(sum, max);
        int n = arr.length;
        for (int i = 1; i <= n - k; i++) {
            sum = sum + arr[i + k - 1] - arr[i - 1];
            max = Math.max(sum, max);
        }
        return max;
    }
}