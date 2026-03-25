// User function Template for Java

class Solution {
    static String preToPost(String pre_exp) {
        // code here
        Stack<String> st = new Stack<>();
        
        for (int i = pre_exp.length() - 1; i >= 0; i--) {
            String str = "";
            char ch = pre_exp.charAt(i);
            if (Character.isLetter(ch)) 
                st.push(String.valueOf(ch));
            else {
                str += st.pop();
                str += st.pop();
                str += String.valueOf(ch);
                st.push(str);
            }
        }
        return st.peek();
    }
}
