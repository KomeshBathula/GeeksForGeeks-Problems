// User function Template for Java
class Solution {
    int findLength(String s) {
        // code here
        s = s.trim();
        int len = 0;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i) != ' ') len++;
            else break;
        }
        return len;
    }
}