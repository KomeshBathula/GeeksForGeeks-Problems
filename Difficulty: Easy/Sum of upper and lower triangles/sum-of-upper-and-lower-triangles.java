
class Solution {
    public ArrayList<Integer> sumTriangles(int mat[][]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int uSum = 0, lSum = 0;
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat.length;j++){
                //in upper i is always >= j
                if(i>=j) uSum += mat[i][j];
                //in lower j is always >=i
                if(j>=i) lSum += mat[i][j];
            }
        }
        list.add(lSum);
        list.add(uSum);
        return list;
    }
}