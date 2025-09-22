// User function Template for Java

class Solution {
    public String removeConsonants(String s) {
        // code here.
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(isVowel(ch)) sb.append(ch);
        }
        if(sb.length()>0) return sb.toString();
        return "No Vowel";
    }
    static boolean isVowel(Character ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
           ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') return true;
        return false;
    }
    
}
