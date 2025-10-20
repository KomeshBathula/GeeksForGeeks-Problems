
class Solution {
    public static ArrayList<Integer> getPrimes(int n) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=2;i<=n/2;i++){
            if(isPrime(i)){
                if(isPrime(n-i)){
                    al.add(i);
                    al.add(n-i);
                    return al;
                }
            }
        }
        al.add(-1);
        al.add(-1);
        return al;
    }
    static boolean isPrime(int n){
        if(n<=1) return false;
        if(n==2||n==3) return true;
        if(n%2==0||n%3==0) return false;
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
}
