class Solution {
    public int findSum(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                sb.append(ch);
            }
            else if(sb.length()>0) {
                    String num = sb.toString();
                    sum += Integer.parseInt(num);
                    sb.setLength(0);
                }
        }
        if(sb.length()>0) 
            sum+= Integer.parseInt(sb.toString());
        return sum;
    }
}