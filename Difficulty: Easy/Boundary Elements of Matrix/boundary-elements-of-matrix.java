// User function Template for Java

class Solution {
    public int[] BoundaryElements(int[][] matrix) {
        // code here
        if(matrix.length == 1){
             return new int[] {matrix[0][0]};
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<matrix[0].length;i++){
            list.add(matrix[0][i]);
        }
        for(int i = 1;i<matrix.length-1;i++){
            list.add(matrix[i][0]);
            list.add(matrix[i][matrix[0].length - 1]);
        }
        for(int i = 0;i<matrix[0].length;i++){
            list.add(matrix[matrix.length - 1][i]);
        }
        int res[] = new int[list.size()];
        for(int i = 0;i<res.length;i++) res[i] = list.get(i);
        return res;
    }
}