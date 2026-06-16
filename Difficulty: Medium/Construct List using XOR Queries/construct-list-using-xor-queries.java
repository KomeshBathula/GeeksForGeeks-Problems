class Solution {
    public ArrayList<Integer> constructList(int[][] queries) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        // as the initial value is 0
        result.add(0);
        
        int q_len = queries.length;
        int xorVal = 0;
        
        for (int i = 0; i < q_len; i++) {
            int type = queries[i][0];
            int x = queries[i][1];
            
            if (type == 0) {
                result.add(x ^ xorVal);
            }
            
            else {
                xorVal ^= x;
            }
        }
        for (int j = 0; j < result.size(); j++) {
            result.set(j, result.get(j) ^ xorVal);
        }
        
        Collections.sort(result);
        return result;
    }
}