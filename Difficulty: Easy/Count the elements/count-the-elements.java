// User function Template for Java

class Solution {
    public static int[] countElements(int a[], int b[], int n, int query[], int q) {
        int res[] = new int[q];
        for(int i = 0;i<q;i++){
            int el = a[query[i]];
            int count = 0;
            for(int j = 0;j<b.length;j++){
                if(b[j]<=el) count++;
            }
            res[i] = count;
        }
        return res;
        
    }
}
