class Solution {
    public String reverse(String S) {
        // code here
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char ch : S.toCharArray())
            stack.push(ch);
        while(stack.size()>0){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}