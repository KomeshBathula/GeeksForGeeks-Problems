// User function Template for Java
class Solution {
    int sameChar(String A, String B) {
        // code 
        int count = 0;
        for(int i = 0;i<A.length();i++){
            char ch1 = A.charAt(i);
            char ch2 = B.charAt(i);
            if(Character.toLowerCase(ch1) == Character.toLowerCase(ch2)) 
                count++;
        }
        return count;
    }
}