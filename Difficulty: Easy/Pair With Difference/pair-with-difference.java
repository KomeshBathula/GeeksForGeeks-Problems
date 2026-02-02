
class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
        Arrays.sort(arr);
        int left = 0, right = 1;
        while (left < arr.length && right < arr.length) {
            int diff = arr[right] - arr[left];
            if (left != right && diff == x) return true;
            else if (diff < x) right++;
            else left++;
        }
        return false;
    }
}
