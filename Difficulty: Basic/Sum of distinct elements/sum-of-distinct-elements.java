// User function Template for Java

class Solution {
    int findSum(int arr[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<arr.length;i++)
            set.add(arr[i]);
        int sum = 0;
        for(Integer x : set)
            sum += x;
        return sum;
    }
}