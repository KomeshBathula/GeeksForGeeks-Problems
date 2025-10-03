

class Solution {
    public String is_common(String[] s, String[] t) {
        // Code here
        HashSet<String> set = new HashSet<>();
        for(String str1 : s) set.add(str1);
        for(String str2 : t){
            if(set.contains(str2)) return "CHANGE";
        }
        return "BEHAPPY";
    }
}
