class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        Stack<Integer> tempStack = new Stack<>();
        while (!st.isEmpty()) {
            int el = st.pop();
            if (tempStack.isEmpty()) tempStack.push(el);
            else {
                while (!tempStack.isEmpty() && el < tempStack.peek()) {
                    st.push(tempStack.pop());
                }
                tempStack.push(el);
            }
        }
        ArrayList<Integer> tempList = new ArrayList<>();
        while (!tempStack.isEmpty()) tempList.add(tempStack.pop());
        for (int i = tempList.size() - 1; i >= 0; i--) {
            st.push(tempList.get(i));
        }
    }
}