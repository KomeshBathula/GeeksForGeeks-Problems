import java.util.*;
class Solution {
    public ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int k) {
        //as the SC os O(1) we need to use two pointer only
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            if(i>0 && arr[i] == arr[i-1]) continue;
            int j = i + 1;
            int k1 = arr.length - 1;
            while(j<k1){
                int sum = arr[i] + arr[j] + arr[k1];
                if(sum == k){
                    ArrayList<Integer> list = new ArrayList<>
                    (Arrays.asList(arr[i], arr[j], arr[k1]));
                    result.add(list);
                    j++;
                    k1--;
                    while(j<k1 && arr[j] == arr[j - 1]) j++;
                    while(j<k1 && arr[k1] == arr[k1 + 1]) k1--;
                }
                
                else if(sum<k) j++;
                else k1--;
            }
        }
        return result;
    }
}
