import java.util.LinkedHashMap;
class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
        for(int x : arr)
            lhm.put(x, lhm.getOrDefault(x, 0) + 1);
        Set<Integer> s = lhm.keySet();
        for(Integer x : s)
            if(x == target) return lhm.get(x);
        return 0;
    }
}
