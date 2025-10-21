class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        if(mat.length == 1){
            for(int i = 0;i<mat.length;i++)
                result.add(mat[0][i]);
                return result;
        }
        //first row
        for(int i = 0;i<mat[0].length;i++)
            result.add(mat[0][i]);
        //right column
        for(int i = 1;i<mat.length -1 ;i++)
            result.add(mat[i][mat[0].length-1]);
        //bottom row
        for(int i = mat[0].length-1;i>=0;i--)
            result.add(mat[mat.length-1][i]);
        //left column
        for(int i = mat.length -2 ;i>0;i--)
            result.add(mat[i][0]);
        return result;
    }
}
