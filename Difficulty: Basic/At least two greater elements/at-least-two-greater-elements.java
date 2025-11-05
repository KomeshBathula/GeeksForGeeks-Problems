// User function Template for Java

class Solution {
    public long[] findElements(long arr[]) {
        // Your code goes here
        long resultArr[] = new long[arr.length - 2];
        Arrays.sort(arr);
        for(int i = 0;i<arr.length - 2;i++) 
            resultArr[i] = arr[i];
        return resultArr;
    }
}