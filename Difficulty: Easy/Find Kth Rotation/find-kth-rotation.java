class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] < arr[right]) {
                //left half is sorted 
                right = mid;
            }
            else 
                left = mid + 1;
        }
        return left - 1;
    }
}