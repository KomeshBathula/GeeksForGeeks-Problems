class Solution {

    int[] Series(int n) {
        // code here
        int arr[] = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2;i<=n;i++) 
            arr[i] = (arr[i-1] + arr[i-2]) % 1000000007;
        return arr;
    }
}