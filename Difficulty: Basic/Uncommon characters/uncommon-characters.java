// User function Template for Java

class Solution {
    String uncommonChars(String s1, String s2) {
        // code here
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s1.length();i++) 
            set1.add(s1.charAt(i));
        for(int i = 0; i<s2.length();i++)
            set2.add(s2.charAt(i));
        for(Character ch : set1){
            if(!set2.contains(ch)) sb.append(ch);
        }
        for(Character ch : set2){
            if(!set1.contains(ch)) sb.append(ch);
        }
        if(sb.length() == 0) return "";
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}