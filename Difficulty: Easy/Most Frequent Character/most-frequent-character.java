class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);
        }
        int max = 0;
        char res = 'z' + 1;
        //to save the lexicographically smaller char
        for(char ch:hm.keySet()){
            int freq = hm.get(ch);
            if(freq>max || (freq == max && ch< res)){
                //if curr freq > then prev freq or freq equal but lexicographical 
                //smaller
                max = freq;
                res = ch;
            }
        }
        return res;
    }
}