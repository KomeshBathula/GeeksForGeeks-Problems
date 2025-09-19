// User function Template for Java
import java.util.HashSet;
class Solution {

    public static String PartyType(int arr[]) {
        // Your code goes here
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<arr.length;i++)
            set.add(arr[i]);
        if(set.size() == arr.length) return "false";
        return "true";
    }
}