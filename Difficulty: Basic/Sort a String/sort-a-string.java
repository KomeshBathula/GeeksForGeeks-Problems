// User function Template for Java
class Solution {
    String sort(String s) {
        // code here
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}