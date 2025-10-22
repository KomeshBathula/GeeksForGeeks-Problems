class Solution {
    double power(double b, int e) {
        // code here
        double result = 1;
        long E = e;
        if(E<0){
            E = -E;
            b = 1/b;
        }
        while(E != 0){
            if(E %2 != 0){
                E--;
                result *= b;
            }
            else{
                E/=2;
                b *= b;
            }
        }
        return result;
    }
}