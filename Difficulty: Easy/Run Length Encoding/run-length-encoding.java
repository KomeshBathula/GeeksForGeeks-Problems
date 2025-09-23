class Solution {
    public static String encode(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)) count++;
            else{
                sb.append(s.charAt(i));
                sb.append(count);
                count = 1;
            }
        }
        sb.append(s.charAt(s.length()-1));
        sb.append(count);
        return sb.toString();
    }
}