class Solution {
    public ArrayList<Integer> countXInRange(int[] arr, int[][] queries) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0], r = queries[i][1], x = queries[i][2];
            int first = firstOccurenceOfX(arr, l, r, x);
            int last = lastOccurenceOfX(arr, l, r, x);
            if (first == -1 || last == -1) 
                result.add(0);
            else 
                result.add(last - first + 1);
        }
        return result;
    }
    private static int firstOccurenceOfX(int arr[], int l, int r, int x) {
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) {
                ans = mid;
                r = mid - 1;
            }
            else if (arr[mid] > x) 
                r = mid - 1;
            else 
                l = mid + 1;
        }
        return ans;
    }
    private static int lastOccurenceOfX(int arr[], int l, int r, int x) {
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) {
                ans = mid;
                l = mid + 1;
            }
            else if (arr[mid] > x) 
                r = mid - 1;
            else 
                l = mid + 1;
        }
        return ans;
    }
}