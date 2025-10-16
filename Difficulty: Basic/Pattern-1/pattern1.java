class Solution {
    static String[] findThePattern(int N) {
        // code here
        String result[] = new String[N];
        char ch = 'A';
        int idx = 0;
        for(int i = 0;i<N;i++){
            String str = "";
            for(int j = 0;j<N;j++){
                if(i==0 || j == 0 || i == N - 1 || j == N - 1)
                    str += ch++;
                else str += "$";
            }
            result[i] = str;
        }
        return result;
    }
};