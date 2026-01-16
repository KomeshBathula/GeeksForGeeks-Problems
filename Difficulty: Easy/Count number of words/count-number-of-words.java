// User function Template for Java
class Solution {
    int countWords(String s) {
        // code here
        int count = 0;
        s = s.replace("\\t", " ");
        s = s.replace("\\n", " ");
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= 1) count ++;
        }
        return count;
    }
}