class Solution {
    public String reverseWords(String s) {
        // Code here
        String arr[] = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<arr.length;i++){
            String str = arr[i];
            char strarr[] = str.toCharArray();
            int left = 0;
            int right = str.length()-1;
            while(left<right){
                char temp = strarr[left];
                strarr[left] = strarr[right];
                strarr[right] = temp;
                left++;
                right--;
            }
            sb.append(String.valueOf(strarr));
            if(i<arr.length-1)sb.append(' ');
        }
        return sb.toString();
    }
}
