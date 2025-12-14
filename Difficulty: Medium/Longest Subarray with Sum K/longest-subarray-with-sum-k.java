// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;
        for (int i = 0;i<arr.length;i++) {
            sum += arr[i];
            if (sum == k) maxLen = Math.max(maxLen, i + 1);
            int rem = sum - k;
            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if (!map.containsKey(sum)) map.put(sum, i);
        }
        return maxLen;
    }
}
