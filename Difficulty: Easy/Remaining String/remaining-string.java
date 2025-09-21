class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        StringBuilder sb = new StringBuilder();
        int count1 = 0;
        for(int i = 0;i<s.length();i++){
            char ch1 = s.charAt(i);
            if(ch1 == ch){
                count1++;
                if (count1 == count){
                while(i+1<s.length()) {
                    sb.append(s.charAt(i+1));
                    i++;
                }
            }
            }
        }
        return sb.toString();
    }
}