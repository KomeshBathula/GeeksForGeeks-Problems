// User function Template for Java
class Solution {
    String merge(String S1, String S2) {
        // code here
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while(i<S1.length() && j<S2.length()){
            sb.append(S1.charAt(i++));
            sb.append(S2.charAt(j++));
        }
        while(i<S1.length()) sb.append(S1.charAt(i++));
        while(j<S2.length()) sb.append(S2.charAt(j++));
        return sb.toString();
    }
}