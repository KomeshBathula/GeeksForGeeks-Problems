// User function Template for Java
class Solution {
    public List<List<Integer>> threeSum(int[] arr, int target) {
        // Your code here
        //using hashmaps
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int j = i + 1;j<arr.length;j++){
                int diff = target - (arr[i]+arr[j]);
                if(map.containsKey(diff)){
                        for(int k = 0;k<map.get(diff);k++){
                            ArrayList<Integer> trip = new ArrayList<>(Arrays.asList(arr[i], arr[j], diff));
                            Collections.sort(trip);
                            result.add(trip);
                    }
                }
                map.put(arr[j], map.getOrDefault(arr[j],0) + 1);
            }
        }
        return result;
    }
}