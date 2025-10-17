class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n = arr.length;
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
        for(int i : arr)
            lhm.put(i, lhm.getOrDefault(i, 0)+1);
        Set<Integer> s = lhm.keySet();
        for(Integer x : s){
            if(lhm.get(x)>(n/2)) return x;
        }
        return -1;
    }
}