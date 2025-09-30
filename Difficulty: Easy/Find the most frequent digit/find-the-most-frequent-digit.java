// User function Template for Java
class Solution {
    String solve(String N) {
        // code here
        HashMap<Character,Integer> hm = new HashMap<>();
        char arr[] = N.toCharArray();
        for(int i = 0;i<arr.length;i++)
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        int max = 0;
        char prev = '0';
        for(Map.Entry<Character, Integer> e : hm.entrySet()){
            int freq = e.getValue();
            if(freq>max || (freq == max) && e.getKey()>prev){
                max = freq;
                prev = e.getKey();
            }
        }
        return String.valueOf(prev);
    }
}