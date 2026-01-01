// User function Template for Java

class Solution {
    int longestUniqueSubstring(String s) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int l = 0, r = 0;
        while (r < s.length()) {
            char ch = s.charAt(r);
            if (map.containsKey(ch))
                l = Math.max(l, map.get(ch) + 1);
            map.put(ch, r);
            maxLen = Math.max(maxLen, r - l + 1);
            r ++;
        }
        return maxLen;
    }
}