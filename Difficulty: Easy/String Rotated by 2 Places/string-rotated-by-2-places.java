class Solution {
    public static boolean isRotated(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()) return false;
        if(s1.length()<2) return s1.equals(s2);
        int n = s1.length();
        String antiClock = s1.substring(2) + s1.substring(0,2);
        String clock = s1.substring(n-2) + s1.substring(0, n-2);
        return s2.equals(antiClock) || s2.equals(clock);
        //return s2.equals(antiClockWise(s1)) || s2.equals(clockWise(s1));
    }
    static String antiClockWise(String s){
        StringBuilder s1 = new StringBuilder(s);
        char temp = s1.charAt(0);
        s1.setCharAt(0, s1.charAt(1));
        s1.setCharAt(1, temp);
        int left = 2, right = s1.length()-1;
        while(left<=right){
            temp = s1.charAt(left);
            s1.setCharAt(left, s1.charAt(right));
            s1.setCharAt(right, temp);
            left++;
            right--;
        }
        left = 0; right = s1.length()-1;
        while(left<=right){
            temp = s1.charAt(left);
            s1.setCharAt(left, s1.charAt(right));
            s1.setCharAt(right, temp);
            left++;
            right--;
        }
        return s1.toString();
    }
    static String clockWise(String s){
        StringBuilder s1 = new StringBuilder(s);
        char temp = s1.charAt(s1.length()-1);
        s1.setCharAt(s1.length()-1, s1.charAt(s1.length()-2));
        s1.setCharAt(s1.length()-2, temp);
        int left = 0, right = s1.length()-3;
        while(left<=right){
            temp = s1.charAt(left);
            s1.setCharAt(left, s1.charAt(right));
            s1.setCharAt(right, temp);
            left++;
            right--;
        }
        left = 0; right = s1.length()-1;
        while(left<=right){
            temp = s1.charAt(left);
            s1.setCharAt(left, s1.charAt(right));
            s1.setCharAt(right, temp);
            left++;
            right--;
        }
        return s1.toString();
    }
}