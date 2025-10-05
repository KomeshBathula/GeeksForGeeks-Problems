/*Complete the given function*/
class GfG {
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][], int r, int c) {
        // add code here.
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i = 0;i<r;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0;j<c;j++){
                list.add(a[i][j]);
            }
            if(!result.contains(list)) result.add(list);
        }
        return result;
    }
}