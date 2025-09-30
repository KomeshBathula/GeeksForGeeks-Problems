// User function Template for Java

class Solution {
    static int isSquare(String S)

    {
        // code here
        int sum = 0;
        for(int i = 0;i<S.length();i++){
            sum += (int)(S.charAt(i));
        }
        if(Math.floor(Math.sqrt(sum)) == Math.ceil(Math.sqrt(sum))) return 1;
        return 0;
    }
}