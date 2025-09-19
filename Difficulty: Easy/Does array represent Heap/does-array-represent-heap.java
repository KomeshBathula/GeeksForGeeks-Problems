// User function Template for Java

class Solution {

    public boolean countSub(long arr[], long n) {
        // Your code goes here
        for(int i = 0;i<=(arr.length-2)/2;i++){
            int el1 = 2*i+1;
            int el2 = 2*i+2;
            if(el1<n && arr[i]<arr[el1]) return false;
            if(el2<n && arr[i]<arr[el2]) return false;
        }
        return true;
    }
}