class Solution {
    public int nCr(int n, int r) {
        // code here
        // we just need to calculate n!/(n-r)!
        //for that we need to iterate through only r
        //becoz 5C2 is 5x4/2x1
        //which means n is decreasing i is r is incrasing(1x2)
        if(r == 0 || n == r) return 1;
        if(n<r) return 0;
        if(r>n - r) r = n - r;
        if(r == 1) return n;
        long res = 1L;
        for(int i = 0;i<r;i++){
            res = res*(n-i);
            res /= (i+1);
        }
        return (int)res;
    }
}