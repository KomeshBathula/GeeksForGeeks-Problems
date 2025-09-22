// User function Template for Java

class Solution {
    static int isGoodorBad(String S) {
        // code here
        int vowCnt = 0, consCnt = 0;
        for(int i = 0;i<S.length();i++){
            char ch = S.charAt(i);
            if(isVowel(ch)){
                vowCnt ++;
                consCnt = 0;
                if(vowCnt>5) return 0;
            }
            else if(ch == '?'){
                vowCnt ++;
                consCnt ++;
                if(vowCnt>5 || consCnt>3) return 0;
            }
            else {
                consCnt ++;
                vowCnt = 0;
                if(consCnt>3) return 0;
            }
        }
        return 1;
    }
    static boolean isVowel(Character ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        return false;
    }
};