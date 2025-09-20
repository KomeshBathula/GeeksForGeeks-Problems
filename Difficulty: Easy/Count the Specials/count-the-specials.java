class Solution {
    public int countSpecials(int k, List<Integer> arr) {
        // Your code goes here.
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<arr.size();i++)
            map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);
        int count = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() == (arr.size()/k)) count++;
        }
        return count;
    }
}