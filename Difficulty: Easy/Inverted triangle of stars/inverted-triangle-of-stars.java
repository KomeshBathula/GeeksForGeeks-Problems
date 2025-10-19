class Solution {
    static String[] invIsoTriangle(int n) {
        // code here
        String result[] = new String[n];
        for(int i = 0;i<n;i++){
            String str = "";
            for(int j = 0;j<i;j++)
                str += " ";
            for(int j = 1;j <= (2*n-1)-(2*i);j++)
                str += "*";
            for(int j = 0;j<i;j++)
                str += " ";
            result[i] = str;
        }
        return result;
    }
};