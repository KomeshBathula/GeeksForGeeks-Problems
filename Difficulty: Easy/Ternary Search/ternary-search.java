class Solution {
    public int findMinIndex(int[] arr) {
        // code here
        //here left and right are the peak points 
        int left = 0, right = arr.length - 1;
        while(left<right){
            int mid1 = left + (right-left)/3;
            int mid2 = right - (right-left)/3;
            if(arr[mid1]>arr[mid2]) left = mid1 + 1;
            else right = mid2 - 1;
        }
        return left;
    }
}
