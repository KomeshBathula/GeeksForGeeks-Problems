// User function Template for Java
class Solution {
    public static int binarySearchArray(int arr[], int k) {
        // Your code here
        int low = 0, high = arr.length - 1;
        while(low<=high){
            int m = (low+high)/2;
            if(arr[m] == k) return m;
            else if(arr[m]>k) high = m - 1;
            else low = m + 1;
        }
        return -1;
    }
}