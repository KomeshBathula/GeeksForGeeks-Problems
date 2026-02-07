class Solution {
    int maxSum(int[] arr) {
        // code here
        int n = arr.length;
        int arrSum = 0;
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
            currSum += i * arr[i];
        }
        int res = currSum;
        for (int i = 1; i < n; i++) {
            currSum = currSum + arrSum - n * arr[n - i];
            res = Math.max(res, currSum);
        }
        return res; 
    }
}