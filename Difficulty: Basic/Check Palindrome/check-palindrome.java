class Solution {
    public static boolean isPalindrome(String s) {
        // code here
        int left = 0, right = s.length()-1;
        while(left<right){
            char ch1 = s.charAt(left);
            char ch1lower = Character.toLowerCase(ch1);
            char ch2 = s.charAt(right);
            char ch2lower = Character.toLowerCase(ch2);
            if(ch1lower != ch2lower) return false;
            left++;
            right--;
        }
        return true;
    }
}