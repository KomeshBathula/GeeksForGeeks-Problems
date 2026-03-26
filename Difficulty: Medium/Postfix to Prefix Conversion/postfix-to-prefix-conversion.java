// User function Template for Java

class Solution {
    static String postToPre(String post_exp) {
        // code here
        Stack<String> st = new Stack<>();
        for (int i = 0; i < post_exp.length(); i++) {
            char ch = post_exp.charAt(i);
            if (Character.isLetter(ch)) 
                st.push(String.valueOf(ch));
            else {
                String op1 = st.pop();
                String op2 = st.pop();
                st.push(ch + op2 + op1);
            }
        }
        return st.peek();
    }
}
