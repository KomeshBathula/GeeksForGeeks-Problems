
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length, sum = 0;
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            int rem = sum - target;
            if (map.containsKey(rem)) {
                result.add(map.get(rem) + 2);
                result.add(i + 1);
                return result;
            }
            if (!map.containsKey(sum))
                map.put(sum, i);
        }
        result.add(-1);
        return result;
    }
}
