// User function Template for Java

class Solution {
    String removeVowels(String s) {
        // code here
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<s.length();i++){
           char ch = s.charAt(i);
           if(!isVowel(ch)) result.append(ch);
        }
        return result.toString();
    }
    static boolean isVowel(char ch){
        String vowels = "aeiouAEIOU";
        if(vowels.indexOf(ch) != -1) return true;
        return false;
    }
}