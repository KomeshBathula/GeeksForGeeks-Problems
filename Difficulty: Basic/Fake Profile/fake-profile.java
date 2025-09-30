// User function Template for Java

class Solution {
    public String solve(String a) {
        // code here
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<a.length();i++){
            char ch = a.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') 
                set.add(ch);
        }
        return (set.size()%2 != 0)?"HE!": "SHE!";
    }
}