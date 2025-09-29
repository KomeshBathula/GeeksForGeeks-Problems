// User function Template for Java

class Solution {
    static String triDownwards(String S) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<S.length();i++){
            for(int j = 0;j<i;j++) sb.append('.');
            for(int j = i;j<S.length();j++){
                sb.append(S.charAt(j));
            }
            //sb.append('.');
        }
        return sb.toString();
    }
};