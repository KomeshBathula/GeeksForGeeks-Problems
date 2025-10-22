import java.util.LinkedHashMap;
class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        //using maps uses O(n) + O(n) = O(2n)
        /*
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
        for(int x : arr)
            lhm.put(x, lhm.getOrDefault(x, 0) + 1);
        Set<Integer> s = lhm.keySet();
        for(Integer x : s)
            if(x == target) return lhm.get(x);
        return 0;
        */
        //using binary search
        int last_occurence = lastOccurence(arr, target);
        int first_occurence = firstOccurence(arr, target);
        if(last_occurence == -1 && first_occurence == -1) return 0;
        return last_occurence - first_occurence + 1;
    }
    static int lastOccurence(int arr[], int target){
        int left = 0, right = arr.length - 1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] == target){
                if(mid != arr.length - 1 && arr[mid+1] == target)
                    left = mid + 1;
                else return mid;
            }
            else if(arr[mid]>target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
    static int firstOccurence(int arr[], int target){
        int left = 0, right = arr.length - 1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] == target){
                if(mid !=0 && arr[mid-1] == target)
                    right = mid - 1;
                else return mid;
            }
            else if(arr[mid]>target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
}
