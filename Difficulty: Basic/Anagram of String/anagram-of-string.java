/*Complete the function below*/
class GfG {
    public int remAnagrams(String s1, String s2) {
        // add code here.
        TreeMap<Character, Integer> map1 = new TreeMap<>();
        TreeMap<Character, Integer> map2 = new TreeMap<>();
        for(int i = 0;i<s1.length();i++) 
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i),0) + 1);
        for(int i = 0;i<s2.length();i++)
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i),0) + 1);
        int count = 0;
        for(Character key : map1.keySet()){
            if(map2.containsKey(key)){
                int val1 = map1.get(key);
                int val2 = map2.get(key);
                count += Math.abs(val1 - val2);
            }
            else count += map1.get(key);
        }
        for(Character key : map2.keySet()){
            if(!map1.containsKey(key)){
                count += map2.get(key);
            }
        }
        return count;
    }
}