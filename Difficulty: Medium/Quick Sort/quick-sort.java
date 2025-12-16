class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if (low >= high) return ;
        int partitionIndex = partition(arr, low, high);
        quickSort(arr, low, partitionIndex - 1);
        quickSort(arr, partitionIndex + 1, high);
    }

    private int partition(int[] arr, int low, int high) {
        // code here
        int pivot = arr[low];
        int left = low, right = high;
        while (left < right) {
            while (arr[left] <= pivot && left <= high - 1) 
                left ++;
            while (arr[right] > pivot && right >= low + 1) 
                right --;
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[right];
        arr[right] = temp;
        return right;
    }
}