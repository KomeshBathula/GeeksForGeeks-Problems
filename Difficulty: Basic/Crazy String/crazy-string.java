// User function Template for Java

class Solution {
    static String getCrazy(String s) {
        // Your code here
        StringBuilder sb = new StringBuilder();
        if(Character.isUpperCase(s.charAt(0))){
            for(int i = 0;i<s.length();i++){
                if(i%2 == 0) sb.append(Character.toUpperCase(s.charAt(i)));
                else sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        else{
            for(int i = 0;i<s.length();i++){
                if(i%2 != 0) sb.append(Character.toUpperCase(s.charAt(i)));
                else sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return sb.toString();
    }
}