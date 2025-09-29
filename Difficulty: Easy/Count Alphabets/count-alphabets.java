// User function Template for Java

class Solution {
    static int Count(String S) {
        // code here
        int count = 0;
        //with isLetter() method
        for(int i = 0;i<S.length();i++){
            if(Character.isLetter(S.charAt(i))) count++;
        }
        //with ascii values
        count = 0;
        for(int i = 0;i<S.length();i++){
            char ch = S.charAt(i);
            if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) count++;
        }
        return count;
    }
}