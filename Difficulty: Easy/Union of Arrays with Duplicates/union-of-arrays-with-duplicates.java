class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int val : a) set.add(val);
        for(int val : b) set.add(val);
        ArrayList<Integer> result = new ArrayList<>(set);
        return result;
    }
}