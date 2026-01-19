// User function Template for Java

class Solution {
    static int toyCount(int N, int K, int arr[]) {
        // code here
        Arrays.sort(arr);
        int count_of_toys = 0;
        for (int val : arr) {
            if (val <= K) {
                count_of_toys ++;
                K -= val;
            }
        }
        return count_of_toys;
    }
}