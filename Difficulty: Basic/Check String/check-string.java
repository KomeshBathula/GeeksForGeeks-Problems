// User function Template for Java

class Sol {
    Boolean check(String s) {
        // your code here
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<s.length();i++) set.add(s.charAt(i));
        return (set.size() == 1);
    }
}