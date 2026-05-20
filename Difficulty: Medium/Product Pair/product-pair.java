class Solution {
    public boolean isProduct(int[] arr, long target) {
        // code here
        Arrays.sort(arr);
        
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            long curr = (long)arr[left] * arr[right];
            
            if (curr == target) return true;
            
            else if (curr > target) right--;
            
            else left++;
        }
        
        return false;
    }
}