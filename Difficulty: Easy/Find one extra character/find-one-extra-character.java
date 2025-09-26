// User function Template for Java
class Solution {
    public static char extraChar(String s1, String s2) {

        // write your code here
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<s1.length();i++) set.add(s1.charAt(i));
        for(int i = 0;i<s2.length();i++){
            if(!set.contains(s2.charAt(i))) return s2.charAt(i);
        }
        return s2.charAt(s2.length()-1);
    }
}
