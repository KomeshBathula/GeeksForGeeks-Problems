// User function Template for Java

class Solution {
    String firstAlphabet(String S) {
        // code here
        StringBuilder sb = new StringBuilder();
        sb.append(S.charAt(0));
        for(int i = 1;i<S.length();i++){
            if(S.charAt(i) == ' ') sb.append(S.charAt(i+1));
        }
        return sb.toString();
    }
};