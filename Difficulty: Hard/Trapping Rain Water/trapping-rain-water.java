class Solution {
    public int maxWater(int arr[]) {
        // code here
        int lmax = arr[0];
        int rmax = arr[arr.length - 1];
        int i = 1, j = arr.length - 1, total = 0;
        while(i<=j){
            if(lmax<=rmax){
                lmax = Math.max(lmax, arr[i]);
                total += Math.max(0, lmax - arr[i]);
                i++;
            }
            else{
                rmax = Math.max(rmax, arr[j]);
                total += Math.max(0, rmax - arr[j]);
                j--;
            }
        }
        return total;
    }
}
