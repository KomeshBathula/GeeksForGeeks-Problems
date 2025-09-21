// User function Template for Java
class Solution {
    static String removeChars(String str1, String str2) {
        // code here
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str2.length();i++) set.add(str2.charAt(i));
        for(int i = 0;i<str1.length();i++){
            char ch = str1.charAt(i);
            if(!set.contains(ch)) sb.append(ch);
        }
        return sb.toString();
    }
}