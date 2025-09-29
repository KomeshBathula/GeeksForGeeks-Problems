// User function Template for Java

class Solution {
    public Vector<Integer> solve(int n, int d) {
        // code here
        Vector<Integer> v = new Vector<>();
        if(d==0) v.add(0);
        if(d>n) v.add(-1);
        for(int i=0;i<=n;i++){
            int num = i;
            while(num>0){
                if(num%10==d){
                    v.add(i);
                    break;
                }
                num/=10;
            }
        }
        return v;
    }
}