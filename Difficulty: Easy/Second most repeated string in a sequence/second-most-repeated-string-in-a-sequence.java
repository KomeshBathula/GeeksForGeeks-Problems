// User function Template for Java
import java.util.LinkedHashMap;
class Solution {
    String secFrequent(String arr[], int N) {
        // your code here
        //use linked hashmap for order 
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<N;i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        int firMax = 0, secMax = 0;
        for(int f : map.values()){
            if(f>firMax){
                secMax = firMax;
                firMax = f;
            }
            else if(f>secMax && f<firMax) secMax = f;
        }
        for(Map.Entry<String, Integer> e : map.entrySet()){
            if(e.getValue() == secMax){
                return e.getKey();
            }
        }
        return "";
    }
}