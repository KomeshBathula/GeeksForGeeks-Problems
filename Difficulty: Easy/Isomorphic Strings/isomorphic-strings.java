class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()) return false;
        int s1arr[] = new int[256];
        int s2arr[] = new int[256];
        for(int i = 0;i<s1.length();i++){
            if(s1arr[s1.charAt(i)] != s2arr[s2.charAt(i)]) return false;
            s1arr[s1.charAt(i)] = i + 1;
            s2arr[s2.charAt(i)] = i + 1;
        }
        return true;
    }
}