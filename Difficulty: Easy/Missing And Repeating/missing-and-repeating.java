import java.util.*;
class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(hs.contains(arr[i])) al.add(arr[i]);
            hs.add(arr[i]);
            //System.out.println(arr[i]);
        }
        int missingNum = 0;
        for(int i=1;i<=arr.length;i++)
            if(!hs.contains(i)) {
                missingNum = i;
                break;
            }
        al.add(missingNum);
        return al;
    }
}
