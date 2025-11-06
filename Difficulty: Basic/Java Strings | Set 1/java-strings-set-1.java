// User function template for Java

class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(char ch : S1.toCharArray()) sb.append(ch);
        for(char ch : S2.toCharArray()) sb.append(ch);
        return sb.reverse().toString();
    }
}