class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        
        //first swap the rows
        int n = mat.length;
        for(int j = 0;j<n;j++){
            for(int i = 0;i<n/2;i++){
                int temp = mat[i][j];
                mat[i][j] = mat[n-i-1][j];
                mat[n-1-i][j] = temp;
            }
        }
        //then swap the columns
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n/2;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-1-j];
                mat[i][n-1-j] = temp;
            }
        }
        
    }
}