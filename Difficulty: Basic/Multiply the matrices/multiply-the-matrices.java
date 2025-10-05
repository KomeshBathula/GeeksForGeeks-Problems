class Solution {
    static boolean multiplyMatrix(int mat1[][], int mat2[][], int result[][]) {
        // code here
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                int sum = 0;
                for(int k = 0;k<4;k++){
                    sum += mat1[i][k] * mat2[k][j];
                }
                if(sum != result[i][j]) return false;
            }
        }
        return true;
    }
}
