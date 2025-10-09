class Solution {
    public void sort012(int[] arr) {
        // code here
        //using counting method
        
        int res[] = new int[arr.length];
        int count0 = 0, count1 = 0, count2 = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0) count0++;
            else if(arr[i] == 1) count1++;
            else count2++;
        }
        for(int i = 0;i<count0;i++) res[i] = 0;
        for(int i = count0;i<count0+count1;i++) res[i] = 1;
        for(int i = count0 + count1;i<count0+count1+count2;i++) res[i] = 2;
        for(int i = 0;i<res.length;i++) arr[i] = res[i];
        
        //using Dutch National Flag Algorithm(DNF)
         
    }
}