// User function Template for Java
class Solution {
    String URLify(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == ' ') sb.append("%20");
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}