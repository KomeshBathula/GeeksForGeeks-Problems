class Solution {
    public String maximumFrequency(String s) {
        // Your Code goes here
        String sarr[] = s.split(" ");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<sarr.length;i++)
            map.put(sarr[i], map.getOrDefault(sarr[i], 0) + 1);
        int max = 0;
        for(int val : map.values())
            max = Math.max(max, val);
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, Integer> e : map.entrySet()){
            if(e.getValue() == max){
                sb.append(e.getKey());
                sb.append(" ");
                sb.append(e.getValue());
                break;
            }
        }
        return sb.toString();
    }
}