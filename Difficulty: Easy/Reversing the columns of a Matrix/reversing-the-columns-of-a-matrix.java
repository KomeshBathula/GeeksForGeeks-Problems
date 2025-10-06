class Solution {
    // Function to reverse the columns of a matrix.
    static void reverseCol(int matrix[][]) {
        // code here
        int n = matrix.length;
        int m = matrix[0].length;
        //if m is iterated through the last result will be same
        for(int j = 0;j<m/2;j++){
            for(int i = 0;i<n;i++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][m-j-1];
                matrix[i][m-j-1] = temp;
            }
        }
    }
}
