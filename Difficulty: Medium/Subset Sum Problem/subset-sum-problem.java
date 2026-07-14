class Solution {
    private static boolean helper(int i, int target, int[] arr, Boolean[][] dp) {
        // base case 
        // if the target is achieved
        if (target == 0) 
            return true;
        
        // if we are the 0th index then return whether that index is target or not 

        if (i == 0) {
            return (arr[0] == target);
        }
        
        // if that is previously computed return that instead of again comptuing it 
        if (dp[i][target] != null) {
            return dp[i][target];
        }
        // there are 2 cases 
        // either take that value or don't take it 
        
        // this is notTake case
        boolean notTake = helper(i - 1, target, arr, dp);
        // this is take case which is initially false
        boolean take = false;
        // only take if the present target is >= present value 
        // because if our target is 3 and present number is 6 we can't take it right. 
        if (target >= arr[i]) {
            take = helper(i - 1, target - arr[i], arr, dp);
        }
        // return either any of case 

        return dp[i][target] = notTake || take;
    }
    static boolean isSubsetSum(int arr[], int sum) {
        // memoization
        int n = arr.length;
        Boolean[][] dp = new Boolean[n][sum + 1];

        return helper(n - 1, sum, arr, dp);
    }
}