class Solution {
    int columnWithMaxZeros(int arr[][], int N) {
        // code here
        int minCol = -1;
        int maxCount = Integer.MIN_VALUE;
        for(int j = 0;j<N;j++){
            int count = 0;
            for(int i = 0;i<N;i++){
                if(arr[i][j] == 0) count++;
            }
            if(count != 0 && count>maxCount){
                minCol = j;
                maxCount = count;
            }
        }
        return minCol;
    }
}