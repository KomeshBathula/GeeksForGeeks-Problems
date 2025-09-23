// User function Template for Java

class Solution {
    public int countWords(String list[], int n) {
        // code here
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0;i<n;i++){
            map.put(list[i], map.getOrDefault(list[i], 0) + 1);
        }
        for(int i : map.values()){
            if(i == 2) count++;
        }
        return count;
    }
}