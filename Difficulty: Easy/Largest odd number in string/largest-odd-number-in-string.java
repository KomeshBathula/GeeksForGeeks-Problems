class Solution {

    String maxOdd(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        int maxIndex = -1;
        for(int i = 0;i<s.length();i++){
            int num = s.charAt(i)-'0';
            if(num%2 != 0) maxIndex = i;
        }
        int i = 0;
        while(i<=maxIndex){ 
            sb.append(s.charAt(i));
            i++;
        }
        return sb.toString();
    }
}