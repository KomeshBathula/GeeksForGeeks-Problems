class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        //with extra space
        
        int m = a.length;
        int n = b.length;
        int resarr[] = new int[m+n];
        int i = 0, j = 0;
        int idx = 0;
        while(i<m && j<n){
            if(a[i]<b[j]){
                resarr[idx++] = a[i++];
            }
            else{
                resarr[idx++] = b[j++];
            }
        }
        while(i<m) resarr[idx++] = a[i++];
        while(j<n) resarr[idx++] = b[j++];
        //for(i = 0;i<m+n;i++) System.out.print(resarr[i]+" ");
        i = 0;
        idx = 0;
        j = m;
        while(i<m) a[idx++] = resarr[i++];
        i = 0;
        while(j<(m+n)) b[i++] = resarr[j++];
        
        //without extra space
        
    }
}
