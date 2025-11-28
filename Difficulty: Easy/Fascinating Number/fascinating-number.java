class Solution {
    boolean fascinating(long n) {
        // code here
        long n2 = n * 2;
        long n3 = n * 3;
        String num = String.valueOf(n) + String.valueOf(n2) + String.valueOf(n3);
        char arr[] = num.toCharArray();
        Arrays.sort(arr);
        //System.out.println(String.valueOf(arr));
        for(int i = 0;i<arr.length;i++){
            if(i+1 != arr[i]-'0') {
                //System.out.println(i+1+" "+arr[i]);
                return false;
            }
        }
        return true;
    }
}