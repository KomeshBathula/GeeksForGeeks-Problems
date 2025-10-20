class Solution {
    public static int largest(int[] arr) {
        // code here
        //O(n) TC
        
        int max = arr[0];
        for(int x : arr)
            if(x>max) max = x;
        return max;
        
        
        //using sorting method
        /*
        Arrays.sort(arr);
        return arr[arr.length-1];
        */
    }
}
