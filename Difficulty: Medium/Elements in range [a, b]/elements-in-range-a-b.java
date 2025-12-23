class Solution {
    public ArrayList<Integer> cntInRange(int[] arr, int[][] queries) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0], h = queries[i][1];
            int first = lowerBound(arr, l);
            int second = upperBound(arr, h);
            list.add(second - first);
        }
        return list;
    }
    private static int lowerBound(int arr[], int l) {
        int ans = arr.length;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= l) {
                ans = mid;
                high = mid - 1;
            }
            else 
                low = mid + 1;
        }
        return ans;
    }
    private static int upperBound(int arr[], int h) {
        int ans = arr.length;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > h) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
