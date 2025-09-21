// User function Template for Java

class Solution {
    public String convert(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        char c = Character.toUpperCase(s.charAt(0));
        sb.append(c);
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i-1) == ' '){
                char ch = Character.toUpperCase(s.charAt(i));
                sb.append(ch);

            }
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}