class Solution {
    public static int minIndexChar(String s1, String s2) {
        // code here
        //brute force O(m*n)
        /*
        for(int i = 0;i<s1.length();i++){
            for(int j = 0;j<s2.length();j++){
                if(s1.charAt(i) == s2.charAt(j)) return j;
            }
        }
        return -1;
        */
        //using freqArray
        int freq[] = new int[26];
        for(int i=0;i<s2.length();i++)
            freq[s2.charAt(i) - 'a']++;
        for(int i = 0;i<s1.length();i++){
            int ch = s1.charAt(i)-'a';
            if(freq[ch]>0) return i;
        }
        return -1;
        
    }
}