// User function Template for Java

class Solution {
    int maxProduct(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int possibility1 = arr[0] * arr[1] * arr[n - 1];
        int possibility2 = arr[n - 1] * arr[n - 2] * arr[n - 3];
        return Math.max(possibility1, possibility2);
    }
}
