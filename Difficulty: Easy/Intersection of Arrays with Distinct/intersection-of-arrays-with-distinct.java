class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();
        for (int val : a) 
            set.add(val);
        int count = 0;
        for (int val : b) {
            if (set.contains(val)) count++;
            set.add(val);
        }
        return count;
    }
}