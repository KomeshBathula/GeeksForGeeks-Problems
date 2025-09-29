// User function Template for Java

class Sol {
    int closing(String s, int pos) {
        // your code here
        int count = 1;
        for(int i = pos+1;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '[') count++;
            if(ch == ']') count--;
            if(count == 0) return i;
        }
        return -1;
    }
}