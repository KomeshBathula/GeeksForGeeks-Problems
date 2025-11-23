class Solution {
    int missingNumber(int arr[]) {
        // code here
        //using O(n)
        //extreme brute force approach
        
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != i+1) return i+1;
        }
        return arr.length + 1;
    }
}