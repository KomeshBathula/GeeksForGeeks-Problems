// User function Template for Java

class Solution {
    static int extractMaximum(String S) {
        // code here
        int max = -1,sum = -1;
        for(int i=0;i<S.length();i++){
            if(Character.isDigit(S.charAt(i))){
                if(sum==-1) sum = 0;
                sum=sum*10+(S.charAt(i)-'0');
            }
            else{
                if(sum>max) max = sum;
                sum = -1;
            }
        }
        if(sum>max) max = sum;
        return max;
    }
}
