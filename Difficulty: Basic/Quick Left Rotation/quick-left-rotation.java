class Solution {
    void leftRotate(int arr[], int k) {
        k = k%arr.length;
        int left = 0;
        int right = k-1;
        while(left<=right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        left = k;
        right = arr.length-1;
        while(left<=right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        left = 0;
        right = arr.length-1;
        while(left<=right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
