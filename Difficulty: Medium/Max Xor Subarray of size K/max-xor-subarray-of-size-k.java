class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int ans = Integer.MIN_VALUE;
        int xor = 0;
        int n = arr.length;
        for (int i = 0; i < k; i++) 
            xor ^= arr[i];
        ans = Math.max(xor, ans);
        for (int i = k; i < n; i++) {
            xor = xor ^ arr[i] ^ arr[i-k];
            ans = Math.max(ans, xor);
        }
        return ans;
    }
}
