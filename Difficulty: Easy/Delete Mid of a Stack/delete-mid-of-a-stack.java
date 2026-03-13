class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        int mid = (s.size() / 2) + 1;
        Stack<Integer> tempStack = new Stack<>();
        for (int i = 1; i < mid; i++) {
            tempStack.push(s.pop());
        }
        if (!s.isEmpty()) s.pop();
        while (!tempStack.isEmpty()) {
            s.push(tempStack.pop());
        }
        
    }
}