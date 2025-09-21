// User function Template for Java

class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(') {
                count++;
                stack.push(count);
                list.add(count);
            }
            else if(ch == ')'){
                list.add(stack.pop());
            }
        }
        return list;
    }
};