class Solution {
    static long hashString(String s) {

        // Code Here
        String X = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String arr[] = s.split(" ");
        int multiple = arr.length;
        long sum = 0;
        for(int i = 0;i<arr.length;i++){
            String str = arr[i];
            for(int j = 0;j<str.length();j++){
                sum = sum + j + X.indexOf(str.charAt(j));
                //System.out.println(j + " "+sum);
            }
        }
        return multiple * (sum);
    }
};