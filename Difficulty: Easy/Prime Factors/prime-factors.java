class Solution {
    public static ArrayList<Integer> primeFac(int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        while(n%2==0){
            if(!list.contains(2)) list.add(2);
            n = n/2;
        }
        for(int i=3;i*i<=n;i+=2){
            while(n%i==0){
                if(!list.contains(i)) list.add(i);
                n=n/i;
            }
        }
        if(n>1) if(!list.contains(n)) list.add(n);
        return list;
    }
}