// User function Template for Java

class Solution {
    public int countWrongPlacedBalls(String s) {
        // code here.
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(i%2 == 0 && s.charAt(i) != 'R') count++;
            else if(i%2 != 0 && s.charAt(i) != 'B') count++;
        }
        return count;
    }
}