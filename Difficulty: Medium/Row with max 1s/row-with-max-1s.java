// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int row = -1;
        // extreme brute force
        int previousCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int currCount = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 1) currCount ++;
            }
            if (currCount > previousCount) {
                row = i;
                previousCount = currCount;
            }
        }
        return row;
    }
}