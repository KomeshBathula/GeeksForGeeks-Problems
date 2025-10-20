class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
        for(char ch : s.toCharArray())
            lhm.put(ch, lhm.getOrDefault(ch, 0) + 1);
        for(int i = 0; i < s.length(); i++){
            if(lhm.get(s.charAt(i)) == 1) return s.charAt(i);
        }
        return '$';
    }
}
