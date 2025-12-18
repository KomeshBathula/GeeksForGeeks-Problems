class Solution {
    public void sortIt(int[] arr) {
        // code here
        //brute force idea 
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int val : arr) {
            if(val % 2 != 0) oddNumbers.add(val);
            else evenNumbers.add(val);
        }
        int idx = 0;
        for (int x : oddNumbers) arr[idx ++] = x;
        for (int x : evenNumbers) arr[idx ++] = x;
        
        int low = 0, high = arr.length - 1;
        quickSort1(arr, low, oddNumbers.size() - 1);
        quickSort2(arr, oddNumbers.size(), high);
    }
    public void quickSort1(int arr[], int low, int high) {
        if ( low >= high) return ;
        int partitionIndex = partition1(arr, low, high);
        quickSort1(arr, low, partitionIndex - 1);
        quickSort1(arr, partitionIndex + 1, high);
    }
    public void quickSort2(int arr[], int low, int high) {
        if ( low >= high) return ;
        int partitionIndex = partition2(arr, low, high);
        quickSort2(arr, low, partitionIndex - 1);
        quickSort2(arr, partitionIndex + 1, high);
    }
    public int partition1(int arr[], int low, int high) {
        int pivot = arr[low];
        int left = low + 1, right = high;
        while (left <= right) {
            while( left <= high && arr[left] >= pivot)
                left ++;
            while (arr[right] < pivot && right >= low + 1) 
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
    public int partition2(int arr[], int low, int high) {
        int pivot = arr[low];
        int left = low + 1, right = high;
        while (left <= right) {
            while(left <= high && arr[left] <= pivot)
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
