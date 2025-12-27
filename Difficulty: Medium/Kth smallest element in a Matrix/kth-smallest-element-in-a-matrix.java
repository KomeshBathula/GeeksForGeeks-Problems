class Solution {
    public int kthSmallest(int[][] mat, int k) {
        // code here
        //brute force 
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) 
                list.add(mat[i][j]);
        }
        Collections.sort(list);
        return list.get(k - 1);
    }
}
