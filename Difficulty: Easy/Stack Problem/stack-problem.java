// User function Template for Java

class Solution{
    static Stack<Integer> deleteMid(int n, Stack<Integer> s)
    {
        // code here
        int mid = (n / 2) + 1;
        Stack<Integer> tempStack = new Stack<>();
        for (int i = 1; i < mid; i++) {
            tempStack.push(s.pop());
        }
        if (!s.isEmpty()) s.pop();
        while (!tempStack.isEmpty()) {
            s.push(tempStack.pop());
        }
        return s;
    }
}