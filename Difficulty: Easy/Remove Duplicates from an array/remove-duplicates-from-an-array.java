class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) 
            set.add(num);
        return new ArrayList<>(set);
    }
}