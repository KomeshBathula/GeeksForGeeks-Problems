class Solution {
    public String toggleCase(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)) sb.append(Character.toLowerCase(ch));
            else sb.append(Character.toUpperCase(ch));
        }
        return sb.toString();
    }
}
