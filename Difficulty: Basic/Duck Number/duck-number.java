// User function Template for Java

class Solution {
    static boolean check_duck(String N) {
        // code here
        //cannot be solved by converting this to number
        /*
        int num = Integer.valueOf(N);
        while(num>0){
            if(num%10 == 0) return true;
            num/=10;
        }
        return false;
        */
        
        //check first char if 0 return false
        //if not then check entire stirng and return either true or false
        if(N.charAt(0) == '0') return false;
        for(int i = 0;i<N.length();i++){
            if(N.charAt(i) == '0') return true;
        }
        return false;
    }
}