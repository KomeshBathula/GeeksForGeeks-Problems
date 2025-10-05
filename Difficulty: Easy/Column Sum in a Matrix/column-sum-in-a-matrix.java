class Solution {
    public static int[] colSum(int mat[][]) {
        // Code Here
        int n = mat.length;
        int m = mat[0].length;
        if(n == 0) return new int[0];
        int res[] = new int[m];
        for(int j = 0;j<m;j++){
            int sum = 0;
            for(int i = 0;i<n;i++){
                sum+=mat[i][j];
            }
            res[j] = sum;
        }
        return res;
    }
}