// User function Template for Java

class Sol {
    Boolean balancedNumber(String N) {
        // your code here
        int left = 0, right = N.length()-1;
        int LHS = 0, RHS = 0;
        int mid = (left+right)/2;
        while(left<=mid-1){
            LHS += N.charAt(left)-'0';
            //System.out.println(LHS);
            left++;
        }
        while(mid+1<=right){
            RHS += N.charAt(mid+1)-'0';
            //System.out.println(RHS);
            mid++;
        }
        return (RHS == LHS);
    }
}