// User function Template for Java

class Solution {
    String gameResult(String s) {
        // your code here
        char A = s.charAt(0);
        char B = s.charAt(1);
        if(A == B) return "DRAW";
        else if((A == 'R' && B == 'S') ||
                (A == 'P' && B == 'R') || 
                (A == 'S' && B == 'P'))
            return "A";
        return "B";
    }
}