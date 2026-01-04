class Solution {
    public void printNos(int n) {
        // Code here
        //return when it hits zero
        if (n == 0) return;
        //decrease the value 
        printNos(n-1);
        //start printing when the value zero hits zero
        System.out.print(n + " ");
    }
}
