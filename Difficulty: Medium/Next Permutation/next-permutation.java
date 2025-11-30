class Solution {
    void nextPermutation(int[] arr) {
        // code here
        //start from the left and find the break point
        int idx = -1;
        int n = arr.length;
        for(int i = n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                idx = i;
                break;
            }
        }
        //if no such element is found then the next permutation is 
        //only sorted order
        if(idx == -1){
            Arrays.sort(arr);
            return;
        }
        //swap the element with just greater than index
        for(int i = n-1;i>=idx;i--){
            if(arr[i]>arr[idx]){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                break;
            }
        }
        int i = idx+1, j = n - 1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
    }
}