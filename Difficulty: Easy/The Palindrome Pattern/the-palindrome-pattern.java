// User function Template for Java

class Solution {
    public String pattern(int[][] arr) {
        // Code here
        String res = "-1";
        //for rows checking 
        for(int i = 0;i<arr.length;i++){
            StringBuilder sb = new StringBuilder();
            int row = i;
            for(int j = 0;j<arr.length;j++){
                sb.append(String.valueOf(arr[i][j]));
            }
            if(isPalindrome(sb.toString())){
                return String.valueOf(row) + " " + "R";
            }
        }
        //for columns checking
        for(int j = 0;j<arr.length;j++){
            StringBuilder sb1 = new StringBuilder();
            int col = j;
            for(int i = 0;i<arr.length;i++){
                sb1.append(String.valueOf(arr[i][j]));
            }
            if(isPalindrome(sb1.toString())){
                return String.valueOf(col) + " " + "C";
            }
        }
        return res;
    }
    
    static boolean isPalindrome(String s){
        int left = 0, right = s.length() - 1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
