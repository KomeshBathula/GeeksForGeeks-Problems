class Solution {
    ArrayList<Integer> result = new ArrayList<>();
    public ArrayList<Integer> pattern(int n) {
        // code here
        result.add(n);
        if(n<=0) return result;
        pattern(n-5);
        result.add(n);
        return result;
    }
}