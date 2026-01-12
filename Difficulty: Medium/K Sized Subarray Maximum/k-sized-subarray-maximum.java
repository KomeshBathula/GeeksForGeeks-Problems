class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i])
                dq.removeLast();
            dq.addLast(i);
        }
        list.add(arr[dq.peekFirst()]);
        for (int i = k; i < n; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) 
                dq.removeFirst();
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) 
                dq.removeLast();
            dq.addLast(i);
            list.add(arr[dq.peekFirst()]);
        }
        return list;
    }
}