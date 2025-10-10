// User function Template for Java
class Solution {
    String transform(String Str) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<Str.length();i++){
            char ch = Str.charAt(i);
            if(!isVowel(ch)){
                sb.append('#');
                if(Character.isUpperCase(ch)) sb.append(Character.toLowerCase(ch));
                else sb.append(Character.toUpperCase(ch));
            }
        }
        if(sb.length() == 0) return "-1";
        return sb.toString();
    }
    static boolean isVowel(char ch){
        String vowels = "aeiouAEIOU";
        if(vowels.indexOf(ch) == -1) return false;
        return true;
    }
}