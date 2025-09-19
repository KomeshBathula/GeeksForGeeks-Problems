class Solution {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            if(list.size() == 0) 
                list.add(arr[i]);
            else if((list.get(list.size()-1)<0 && arr[i]>=0) || 
                    (list.get(list.size()-1)>=0 && arr[i]<0))
                list.remove(list.size()-1);
            else 
                list.add(arr[i]);
        }
        return list;
    }
}
