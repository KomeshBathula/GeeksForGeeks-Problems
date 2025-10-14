class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int lo = 0;
        int hi = arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==k){
                if(mid==0) return mid;
                if(arr[mid-1]==k) hi = mid-1;
                else return mid;
            }
            else if(k>=arr[mid])lo= mid+1;
            else hi = mid-1;
        }
        return -1;
    }
}