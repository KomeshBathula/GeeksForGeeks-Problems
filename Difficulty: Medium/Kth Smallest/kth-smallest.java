class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        // brute force
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
