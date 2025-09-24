class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = 0;
        int sec_max = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max && arr[i]>sec_max) sec_max = arr[i];
        }
        return sec_max;
    }
}