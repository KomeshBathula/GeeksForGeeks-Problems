class Solution {
    public boolean isMaxHeap(int[] arr) {
        // code here
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (2 * i + 1 < n && arr[i] < arr[2 * i + 1])
                return false;
            if (2 * i + 2 < n && arr[i] < arr[2 * i + 2])
                return false;
        }
        return true;
    }
}