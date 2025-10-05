// User function Template for Java

class Solution {

    public boolean ValidTrack(int[] arr) {
        // write code here
        int mid = (arr.length)/2;
        //middle element is 1 and corresponding pillars are identical check
        if(arr[mid] != 1 && arr[mid+1] != arr[mid-1]) return false;
        int left = mid - 1, right = mid + 1;
        while(left>=0 && right<arr.length){
            if(arr[left] != arr[right]) return false;
            left--;
            right++;
        }
        return true;
    }
}