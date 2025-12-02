class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        //extreme brute force solution
        //this take Time : O(n+m log(n+m)) Space : O(n+m)
        /*
        HashSet<Integer> set = new HashSet<>();
        for(int val : a) set.add(val);
        for(int val : b) set.add(val);
        ArrayList<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        return result;
        */
        //passes only 1110 test cases 
        
        //optimal solution
        int i = 0, j = 0;
        int n = a.length, m = b.length;
        ArrayList<Integer> result = new ArrayList<>();
        int lastInsert = Integer.MIN_VALUE;
        while(i < n && j < m){
            if(a[i] == b[j]){
                if(lastInsert != a[i]){
                    result.add(a[i]);
                    lastInsert = a[i];
                }
                i++;j++;
            }
            else if(a[i]<b[j]){
                if(lastInsert != a[i]){
                    result.add(a[i]);
                    lastInsert = a[i];
                }
                i++;
            }
            else{
                if(lastInsert != b[j]){
                    lastInsert = b[j];
                    result.add(b[j]); 
                }
                j++;
            }
        }
        while(i < n){
            if(lastInsert != a[i]){
                result.add(a[i]);
                lastInsert = a[i];
            }
            i++;
        }
        while(j < m){
            if(lastInsert != b[j]){
                result.add(b[j]); 
                lastInsert = b[j];
            }
            j++;
        }
        return result;
    }
}
