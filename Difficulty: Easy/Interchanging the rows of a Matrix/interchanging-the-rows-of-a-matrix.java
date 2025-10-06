class Solution {
    // Function to interchange the rows of a matrix.
    static void interchangeRows(int matrix[][]) {
        // code here
        int n1 = matrix.length;
        int m1 = matrix[0].length;
        //if i is iterated through n then double time changes the row
        //which means the result will be same lol
        for(int i = 0;i<n1/2;i++){
            for(int j = 0;j<m1;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n1-i-1][j];
                matrix[n1-i-1][j] = temp;
            }
        }
    }
}
