class Solution {
    private int helper(int i, int buy, int[] arr, int[][] dp) {
        if (i == arr.length)    
            return 0;
        
        if (dp[i][buy] != -1) 
            return dp[i][buy];
        
        int profit = 0;
        
        // ready to buy a stock
        if (buy == 1) {
            profit = 
            Math.max(-arr[i] + helper(i + 1, 0, arr, dp), // bought this now sell
                     helper(i + 1, 1, arr, dp)); // did not buy this still ready to buy
        } 
        // already having a stock
        else {
            profit = 
            Math.max(arr[i] + helper(i + 1, 1, arr, dp), // sell today so profit becomes present rate
                     helper(i + 1, 0, arr, dp)); // don't sell today find another day
        }
        
        return dp[i][buy] = profit;
    }
    
    int stockBuySell(int arr[]) {
        int n = arr.length;
        int[][] dp = new int[n][2];
        
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        return helper(0, 1, arr, dp);
    }
}
