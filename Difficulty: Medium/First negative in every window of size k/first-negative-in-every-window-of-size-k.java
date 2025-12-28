class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        List<Integer> res = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < k; i++){
            if(arr[i] < 0) dq.addLast(i);
        }
        int n = arr.length;
        if (dq.isEmpty()) res.add(0);
        else res.add(arr[dq.peekFirst()]);
        for (int i = k; i < n ; i++) {
        if (!dq.isEmpty() && dq.peekFirst() <= i - k ) 
            dq.pollFirst();
        if(arr[i] < 0) dq.addLast(i);
        if (dq.isEmpty()) res.add(0);
        else res.add(arr[dq.peekFirst()]);
        }
        return res;
    }
}