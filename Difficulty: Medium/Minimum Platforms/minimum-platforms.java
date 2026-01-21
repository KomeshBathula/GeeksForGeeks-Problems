class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int j = 0; int count = 0; int result = 0;
        for (int i = 0; i < arr.length; i++) {
            while (j < arr.length && dep[j] < arr[i]) {
                count --;
                j ++;
            }
            count ++;
            result = Math.max(result, count);
        }
        return result;
    }
}
