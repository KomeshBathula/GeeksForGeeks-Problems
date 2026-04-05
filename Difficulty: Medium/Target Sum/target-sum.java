class Solution {
    static final int mod = 1000000007;
    int findWays(int n, int[] arr, int K) {
        int[] prev = new int[K + 1];
        if (arr[0] == 0) prev[0] = 2;
        else prev[0] = 1;
        if (arr[0] != 0 && arr[0] <= K) prev[arr[0]] = 1;
        for (int i = 1; i < n; i++) {
            int[] curr = new int[K + 1];
            for (int sum = 0; sum <= K; sum++) {
                int notTake = prev[sum];
                int take = 0;
                if (arr[i] <= sum) take = prev[sum - arr[i]];
                curr[sum] = (notTake + take) % mod;
            }
            prev = curr;
        }
        return prev[K];
    }
    public int totalWays(int[] arr, int target) {
        // code here
        int totalSum = 0;
        for (int val : arr) totalSum += val;
        if (totalSum - target < 0 || (totalSum + target)% 2 != 0) return 0;
        return findWays(arr.length, arr, (totalSum + target) / 2);
    }
}