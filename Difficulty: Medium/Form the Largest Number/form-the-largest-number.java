class Solution {
    public String findLargest(int[] arr) {
        // code here
        String[] stringArray = new String[arr.length];
        int i = 0;
        for (int num : arr) 
            stringArray[i++] = String.valueOf(num);
        if (stringArray[0].equals("0")) return "0";
        Arrays.sort(stringArray, (a, b) -> (b+a).compareTo(a+b));
        String ans = "";
        for (String s : stringArray) 
            ans += s;
        return ans;
    }
}