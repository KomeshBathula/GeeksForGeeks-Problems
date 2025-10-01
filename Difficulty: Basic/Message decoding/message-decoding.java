// User function Template for Java

class Solution {
    public boolean decode(String s) {
        // code here
        String res = "hello";
        int idx = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == res.charAt(idx)){
                idx++;
                if(idx == 5) //hello found
                    return true;
            }
        }
        return false;
    }
}