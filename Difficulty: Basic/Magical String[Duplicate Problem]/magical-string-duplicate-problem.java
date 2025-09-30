// User function Template for Java
class Solution {
    static String magicalString(String S) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<S.length();i++){
            char ch = S.charAt(i);
            sb.append((char)('a'+(25-(ch-'a'))));
        }
        return sb.toString();
    }
}