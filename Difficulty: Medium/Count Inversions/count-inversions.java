class Solution {
    static int inversionCount(int a[]) {
        // Code Here
        return mergeSort(a, 0, a.length - 1);
    }
    static int mergeSort (int a[], int low, int high) {
        int count = 0;
        if (low == high) return 0;
        int mid = (low + high) / 2;
        count += mergeSort(a, low, mid);
        count += mergeSort(a, mid + 1, high);
        count += merge(a, low, mid, high);
        return count;
    }
    static int merge(int a[], int low, int mid, int high) {
        int count = 0;
        int temp[] = new int[high - low + 1];
        int left = low, right = mid + 1, idx = 0;
        while (left <= mid && right <= high) {
            if(a[left] <= a[right])
                temp[idx ++] = a[left ++];
            else {
                temp[idx ++] = a[right ++];
                count += mid - left + 1;
            }
        }
        while (left <= mid) 
            temp[idx ++] = a[left ++];
        while (right <= high)
            temp[idx ++] = a[right ++];
        for(int i = low ; i<= high;i++)
            a[i] = temp[i-low];
        return count;
    }
}