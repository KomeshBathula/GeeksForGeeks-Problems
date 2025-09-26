// User function Template for Java
class Solution {
    String transform(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        String str = s.toLowerCase();
        int count = 1;
        for(int i = 1;i<str.length();i++){
            char ch1 = str.charAt(i-1);
            char ch2 = str.charAt(i);
            if(ch1 == ch2) count++;
            else{
                sb.append(count);
                sb.append(ch1);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(str.charAt(s.length()-1));
        return sb.toString();
    }
}