// User function Template for Java

class Solution {

    public static int longest(int arr[]) {
        // write code here
        int max = arr[0];
        int count = 1;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>=max) {
                count++;
                max = arr[i];
            }
        }
        return count;
    }
}
