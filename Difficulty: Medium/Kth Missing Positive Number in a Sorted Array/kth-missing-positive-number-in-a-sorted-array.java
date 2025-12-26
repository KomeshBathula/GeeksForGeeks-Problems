class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int n = arr.length;
        int ans = n;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] - mid - 1 >= k) {
                ans = mid;
                high = mid - 1;
            }
            else 
                low = mid + 1;
        }
        return ans + k;
    }
}