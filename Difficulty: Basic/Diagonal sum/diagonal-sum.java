

class Solution {
    public int DiagonalSum(int[][] matrix) {
        // code here
        int n = matrix.length;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += matrix[i][i]; // left to right diagonal 
            sum += matrix[i][n - i - 1];//right to left diagonal
        }
        return sum;
    }
}