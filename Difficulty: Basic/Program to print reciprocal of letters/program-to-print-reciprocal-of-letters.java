// User function Template for Java
class Solution {
    static String reciprocalString(String S) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<S.length();i++){
            char ch = S.charAt(i);
            if(Character.isLowerCase(ch)){
                sb.append((char)('z'-(ch-'a')));
            }
            else if(Character.isUpperCase(ch)){
                sb.append((char)('Z'-(ch-'A')));                
            }
            else sb.append(ch);
        }
        return sb.toString();
    }
}