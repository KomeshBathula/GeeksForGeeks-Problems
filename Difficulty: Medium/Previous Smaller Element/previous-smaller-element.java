class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() >= arr[i])
                st.pop();
            
            if (st.isEmpty()) 
                ans.add(-1);
            else 
                ans.add(st.peek());
            
            st.push(arr[i]);
        }
        
        return ans;
    }
}