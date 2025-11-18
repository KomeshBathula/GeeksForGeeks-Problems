class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int key : map.keySet())
            res.add(new ArrayList<>(Arrays.asList(key, map.get(key))));
        return res;
    }
}