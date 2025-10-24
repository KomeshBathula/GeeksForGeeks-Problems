// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<ArrayList<Integer>> seen = new HashSet<>();
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(-arr[i])){
                ArrayList<Integer> ilist = new ArrayList<>();
                ilist.add(Math.min(arr[i], -arr[i]));
                ilist.add(Math.max(-arr[i],arr[i]));
                if(!seen.contains(ilist)){
                    list.add(ilist);
                }
                seen.add(ilist);
            }
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        }
        Collections.sort(list, (a,b) ->{
            if(a.get(0) != b.get(0)) return a.get(0) - b.get(0);
            return a.get(1) - b.get(1);
        });
        return list;
    }
}
