class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(hs.contains(arr[i])) al.add(arr[i]);
            hs.add(arr[i]);
        }
        return al;
    }
}