class Solution {
    int convertfive(int num) {
        // Your code here
        if(num == 0) return 5;
        int rev,sum = 0;
        while(num!=0){
            rev = num%10;
            if(rev == 0) rev = 5;
            sum=sum*10+rev;
            num = num/10;
        }
        return reverseInt(sum);
    }
    static int reverseInt(int num){
        int rev;
        int sum = 0;
        while(num!=0){
            rev = num%10;
            sum=sum*10+rev;
            num = num/10;
        }
        return sum;
    }
}