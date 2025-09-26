// User function Template for Java

class Solution {
    public String arrangeString(String s) {
        // code here.
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)) sb.append(ch);
            else {
                int num = Integer.valueOf(ch-'0');
                sum += num;
            }
        }
        String str = sb.toString();
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb1 = new StringBuilder(String.valueOf(arr));
        if(sum>0)sb1.append(sum);
        return sb1.toString();
    }
}
