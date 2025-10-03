// User function Template for Java

class Solution {
    static String demonitize(String S, String m, String n) {
        // code here
        String res = S;
        if(S.contains(m)) S = S.replace(m,"");
        if(S.contains(n)) S = S.replace(n,"");
        else if(res.contains(n)) return "-1";
        if(S.length() == 0) return "-1";
        return S;
    }
};