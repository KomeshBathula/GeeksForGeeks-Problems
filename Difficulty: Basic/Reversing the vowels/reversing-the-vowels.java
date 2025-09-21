// User function Template for Java

class Solution {
    String modify(String s) {
        // your code here
        StringBuilder sb = new StringBuilder(s);
        int left = 0, right = s.length()-1;
        while(left<=right){
            char ch1 = sb.charAt(left);
            char ch2 = sb.charAt(right);
            if(!isVowel(ch1)) left++;
            else if(!isVowel(ch2)) right--;
            else{
                sb.setCharAt(left, ch2);
                sb.setCharAt(right, ch1);
                left++;
                right--;
            }
        }
        return sb.toString();
    }
    static boolean isVowel(char ch){
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(ch) != -1;
    }
}