// User function Template for Java
class Solution {
    String isGoodString(String s) {
        // code here
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)) return "NO";
        }
        return "YES";
    }
}