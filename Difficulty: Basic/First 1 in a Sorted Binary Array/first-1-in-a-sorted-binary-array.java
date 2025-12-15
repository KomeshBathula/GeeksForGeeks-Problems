// User function Template for Java

class Solution {

    public long firstIndex(int arr[]) {
        // Your code goes here
        int n = arr.length;
        if (n == 0 || (n == 1 && arr[0] == 0) || (arr[0] == 0 && arr[n - 1] == 0)) 
            return -1;
        if (n == 1 && arr[0] == 1) return 0;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == 0) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
}