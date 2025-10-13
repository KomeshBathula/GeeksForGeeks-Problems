import java.util.*;
class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        //using 2 pointer
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(i>0 && arr[i] == arr[i-1]) continue;
            int j = i + 1;
            int k = n - 1;
            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == 0){
                    ArrayList<Integer> trip = new ArrayList<>();
                    trip.add(arr[i]);
                    trip.add(arr[j]);
                    trip.add(arr[k]);
                    if( !set.contains(trip)) 
                        result.add(trip);
                    set.add(trip);
                    j++;
                    k--;
                    while(j<k && arr[j] == arr[j - 1]) j++;
                    while(j<k && arr[k] == arr[k + 1]) k--;
                }
                else if (sum<0) j++;
                else k--;
            }
        }
        return result;
        
    }
}
