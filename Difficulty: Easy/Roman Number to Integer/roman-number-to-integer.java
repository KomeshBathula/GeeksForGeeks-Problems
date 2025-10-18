class Solution {
    public int romanToDecimal(String s) {
        // code here
        int decimal = 0;
        for(int i = 0;i<s.length();i++){
            if(i+1<s.length() && getValueOfChar(s.charAt(i)) < getValueOfChar(s.charAt(i+1)))
                decimal -= getValueOfChar(s.charAt(i));
            else decimal += getValueOfChar(s.charAt(i));
        }
        return decimal;
    }
    static int getValueOfChar(char ch){
        if(ch == 'I') return 1;
        else if(ch == 'V') return 5;
        else if(ch == 'X') return 10;
        else if(ch == 'L') return 50;
        else if(ch == 'C') return 100;
        else if(ch == 'D') return 500;
        else if(ch == 'M') return 1000;
        return 0;
    }
}