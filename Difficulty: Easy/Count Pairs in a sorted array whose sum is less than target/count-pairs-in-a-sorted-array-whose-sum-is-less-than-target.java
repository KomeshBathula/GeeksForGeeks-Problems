// User function Template for Java
class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        //O(n^2) code giving TLE
        /*
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i + 1;j<arr.length;j++){
                if(arr[i]+arr[j]<target) count++;
            }
        }
        return count;
        */
        
        //optimal approach
        int left = 0, right = arr.length - 1;
        int count = 0;
        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum<target){
                count+= (right-left);
                left++;
            }
            else right--;
        }
        return count;
    }
}