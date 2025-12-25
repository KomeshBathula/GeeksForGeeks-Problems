class Solution {
    public ArrayList<Integer> findPeakGrid(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0 ;i < n; i++) {
            for (int j = 0; j < m; j++) {
                int up = (i>0) ? mat[i-1][j] : Integer.MIN_VALUE;
                int down = (i<n-1) ? mat[i+1][j] : Integer.MIN_VALUE;
                int left = (j>0) ? mat[i][j-1] : Integer.MIN_VALUE;
                int right = (j<m-1) ? mat[i][j+1] : Integer.MIN_VALUE;
                int curr = mat[i][j];
                if (curr >= up && curr >= down && curr >= left && curr >= right) {
                    res.add(i);
                    res.add(j);
                    return res;
                }
            }
        }
        res.add(-1);
        res.add(-1);
        return res;
    }
}