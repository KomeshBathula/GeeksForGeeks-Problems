class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int countOfOdd = 0, countOfEven = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] % 2 != 0) countOfOdd ++;
            else countOfEven ++;
        }
        return new int[] {countOfOdd, countOfEven };
    }
}