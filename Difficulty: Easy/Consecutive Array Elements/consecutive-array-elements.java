// User function Template for Java

class Solution {
    public boolean areConsecutives(int[] arr) {
        // Your code goes here
        int max = arr[0];
        for(int i : arr) max = Math.max(max, i);
        if(max == arr.length) return true;
        return false;
    }
}