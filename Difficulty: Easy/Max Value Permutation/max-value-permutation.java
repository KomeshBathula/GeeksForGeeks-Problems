// User function Template for Java

class Solution {

    int maxValue(int arr[]) {
        // Complete the function
        Arrays.sort(arr);
        int MOD = 1000000007;
        long ans = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) 
            ans = (ans + ((long)arr[i] * i) % MOD) % MOD;
        return (int)ans;
    }
}
