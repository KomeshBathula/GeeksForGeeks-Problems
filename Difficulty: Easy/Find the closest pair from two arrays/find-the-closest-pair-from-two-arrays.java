class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        // code here
        int left = 0, right = arr2.length - 1;
        int diff = Integer.MAX_VALUE;
        ArrayList<Integer> result = new ArrayList<>();
        while (left < arr1.length && right >= 0) {
            int sum = arr1[left] + arr2[right];
            int currDiff = Math.abs(sum - x);
            if (currDiff < diff) {
                diff = currDiff;
                result.add(0, arr1[left]);
                result.add(1, arr2[right]);
            }
            if (sum > x) right --;
            else left++;
        }
        return result;
    }
}