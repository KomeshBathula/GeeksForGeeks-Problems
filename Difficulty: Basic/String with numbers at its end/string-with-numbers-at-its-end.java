// User function Template for Java

class Solution {
    int isSame(String s) {
        // code here
        int count = 0, num = 0;
        for(int i = 0;i<s.length();i++){
            Character ch = s.charAt(i);
            if(Character.isLetter(ch)) count++;
            else if(Character.isDigit(ch))num = num*10 + (ch-'0');
        }
        if(count == num) return 1;
        return 0;
    }
}