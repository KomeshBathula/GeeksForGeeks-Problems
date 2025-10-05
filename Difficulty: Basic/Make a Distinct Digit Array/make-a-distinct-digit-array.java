// User function Template for Java

class Solution {
    public int[] common_digits(int[] nums) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            int num = nums[i];
            while(num!=0){
                set.add(num%10);
                num/=10;
            }
        }
        int res[] = new int[set.size()];
        int idx = 0;
        for(Integer x : set) res[idx++] = x;
        return res;
    }
}