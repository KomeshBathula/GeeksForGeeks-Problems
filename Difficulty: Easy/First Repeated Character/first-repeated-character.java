// User function Template for Java
class Solution {
    String firstRepChar(String s) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            if(map.get(s.charAt(i)) == 2) return String.valueOf(s.charAt(i));
        }
        return "-1";
    }
}