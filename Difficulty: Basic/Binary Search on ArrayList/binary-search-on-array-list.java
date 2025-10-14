// User function Template for Java
class Solution {
    public static int binarySearchAL(ArrayList<Integer> list, int k) {
        // Your code here
        int low = 0, high = list.size() - 1;
        while(low<=high){
            int mid = (low+high)/2;
            if(list.get(mid) == k) return mid;
            else if(list.get(mid)>k) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
        // If k in arr return 1, else return -1
    }
}