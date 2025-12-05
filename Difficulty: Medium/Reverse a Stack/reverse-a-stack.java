class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        ArrayList<Integer> tempList = new ArrayList<>();
        while(!st.empty())
            tempList.add(st.pop());
        for(int val : tempList) st.push(val);
    }
}
