// User function template for Java

class Solution {
    static String toLower(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            char c = Character.toLowerCase(ch);
            sb.append(c);
        }
        return sb.toString();
    }
}