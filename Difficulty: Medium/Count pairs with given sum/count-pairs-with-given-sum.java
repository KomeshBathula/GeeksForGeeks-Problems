class Solution {
    int countPairs(int arr[], int target) {
        // code here
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])) 
                count += map.get(arr[i]);
            map.put(target-arr[i], map.getOrDefault(target-arr[i], 0) + 1);
        }
        return count;
    }
}