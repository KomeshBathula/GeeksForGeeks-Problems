// User function Template for Java

class Solution {
    String modify(String s) {
        char ch = s.charAt(0);
        if(ch>='a' && ch <= 'z') return s.toLowerCase();
        return s.toUpperCase();
    }
}