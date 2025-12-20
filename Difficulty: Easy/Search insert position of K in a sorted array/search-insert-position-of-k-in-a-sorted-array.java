class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        int ans = arr.length;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            //check if it lies within boundary
            if (arr[mid] >= k) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
};