// User function Template for Java
class Solution {
    static ArrayList<Long> printSeries(int N) {
        // code here
        ArrayList<Long> al = new ArrayList<>();
        if(N==1){
            al.add(1L);
            return al;
        }
        else if(N==2){
            al.add(1L);
            al.add(2L);
            return al;
        }
        else if(N==3){
            al.add(1L);
            al.add(2L);
            al.add(5L);
            return al;
        }
        al.add(1L); al.add(2L); al.add(5L);
        for(int i=3;i<=N;i++){
            al.add(al.get(i-1)+al.get(i-2)+al.get(i-3));
        }
        return al;
    }
}