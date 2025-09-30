// User function Template for Java
class Solution {
    static int findLastOccurence(String A, String B) {
        // code here
        //simply use in built method of String
        
        int index = A.lastIndexOf(B);
        if(index == -1) return -1;
        return index + 1;
        
        //
    }
}