// User function Template for Java
class Solution {
    String convert(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>=65 && ch<=90){
                char ch1 = (char)('Z'-ch+'A');
                sb.append(ch1);
            }
            else{
                char ch2 = (char)('z'-ch+'a');
                sb.append(ch2);
            }
        }
        return sb.toString();
    }
}