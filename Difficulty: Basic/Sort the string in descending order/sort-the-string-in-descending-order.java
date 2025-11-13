// User function Template for Java
class Solution {
    String ReverseSort(String s) {
        // code here
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        StringBuilder sb = new StringBuilder(String.valueOf(ch));
        return sb.reverse().toString();
    }
}