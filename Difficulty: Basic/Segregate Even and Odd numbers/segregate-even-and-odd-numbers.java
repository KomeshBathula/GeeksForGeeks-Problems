class Solution {
    void segregateEvenOdd(int arr[]) {
        // code here
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        
        for(int num : arr) {
            if(num % 2 == 0) even.add(num);
            else odd.add(num);
        }
        
        Collections.sort(even);
        Collections.sort(odd);
        
        int idx = 0;
        for(int num : even) arr[idx++] = num;
        for(int num : odd)  arr[idx++] = num;
    }
}