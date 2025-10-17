// User function Template for Java
class Solution {
    char firstRep(String S) {
        // your code here
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<S.length();i++){
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i),0) + 1);
        }
        for(Map.Entry<Character, Integer> e : map.entrySet()){
            if(e.getValue()>1) return e.getKey();
        }
        return '#';
    }
}