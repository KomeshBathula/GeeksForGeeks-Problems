class Solution {
    int minRow(int mat[][]) {
        // code here
        int minCount = Integer.MAX_VALUE;
        int row = 0;
        for(int i = 0;i<mat.length;i++){
            int count = 0;
            for(int j = 0;j<mat[i].length;j++){
                if(mat[i][j] == 1) count++;
            }
            if(count<minCount){
                row = i;
                minCount = count;
            }
        }
        return row + 1;
    }
};