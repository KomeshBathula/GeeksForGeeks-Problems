class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        int max = arr[0];
        for (int val : arr) max = Math.max(val, max);
        int low = 0, high = max;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (minTime(arr, mid) <= k) {
                high = mid - 1;
            }
            else 
                low = mid + 1;
        }
        return low;
    }
    private static int minTime(int[] arr, int time) {
        int ans = 0;
        for (int val : arr) {
            ans += Math.ceil((double)val / (double)time);
        }
        return ans;
    }
}
