// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : arr) {
            int remaining = target - num;
            if (map.containsKey(remaining)) 
                count += map.get(remaining);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}
