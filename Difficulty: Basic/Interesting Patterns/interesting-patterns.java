class Solution {
    static String[] interestingPattern(int N) {
        // code here
        String str[] = new String[2*N-1];
        for(int i=0;i<2*N-1;i++){
            String string = "";
            for(int j = 0;j<2*N-1;j++){
                int top = i;
                int bottom = j;
                int left = (2*N-2)-j;
                int right = (2*N-2) - i;
                int val = (N - Math.min(Math.min(top,bottom), Math.min(right,left)));
                string += val + "";
            }
            str[i] = string;
        }
        return str;
    }
};