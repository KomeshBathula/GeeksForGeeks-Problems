class Solution {
    public boolean isPalinSent(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                char ch = Character.toLowerCase(s.charAt(i));
                sb.append(ch);
            }
        }
        int left = 0, right = sb.length()-1;
        while(left<=right){
            if(sb.charAt(left) != sb.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}