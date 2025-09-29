// User function Template for Java

class Solution {
    public String amendSentence(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                sb.append(' ');
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
