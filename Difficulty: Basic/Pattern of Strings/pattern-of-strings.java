// User function Template for Java

class Solution {
    ArrayList<String> pattern(String s) {
        // code here
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            String str = "";
            for(int j = 0;j<s.length() -i;j++)
                str += s.charAt(j);
            result.add(str);
        }
        return result;
    }
};