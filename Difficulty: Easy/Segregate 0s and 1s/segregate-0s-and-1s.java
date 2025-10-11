// User function Template for Java

class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int l = 0, r = arr.length - 1;
        while(l<=r){
            if(arr[l] != 0 && arr[r] != 1){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
            else if(arr[l] == 0) l++;
            else r--;
        }
    }
}
