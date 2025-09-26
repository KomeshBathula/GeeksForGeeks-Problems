// User function Template for Java

class Solution {
    public String reverse(String str) {
        // complete the function here
        char arr[] = str.toCharArray();
        int i = 0, j = str.length()-1;
        while(i<j){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);
            if(Character.isLetter(ch1) && Character.isLetter(ch2)){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if(Character.isLetter(ch1)) j--;
            else i++;
        }
        return String.valueOf(arr);
    }
}