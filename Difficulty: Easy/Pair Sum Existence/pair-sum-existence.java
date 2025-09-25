class Geeks {
    public static int sumExists(int arr[], int n, int sum) {
        // add your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(map.containsKey(sum - arr[i])) return 1;
            else map.put(arr[i], i);
        }
        return 0;
    }
}