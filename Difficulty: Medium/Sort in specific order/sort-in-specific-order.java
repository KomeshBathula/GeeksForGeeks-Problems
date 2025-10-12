class Solution {
    public void sortIt(int[] arr) {
        // code here
        int left = 0, right = arr.length - 1;
        while(left<right){
            if(arr[left]%2 == 0 && arr[right]%2 != 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left ++;
                right --;
            }
            else if(arr[left]%2 != 0) left ++;
            else right--;
        }
        int breakPoint = arr.length;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2 == 0) {
                breakPoint = i;
                break;
            }  
        }
        //sort the odds and reverse the array
        Arrays.sort(arr, 0, breakPoint);
        reverseArray(arr, 0, breakPoint - 1);
        //sort the even array
        Arrays.sort(arr, breakPoint, arr.length);
    }
    static void reverseArray(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
