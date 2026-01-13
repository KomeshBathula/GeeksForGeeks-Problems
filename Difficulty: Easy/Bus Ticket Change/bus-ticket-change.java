class Solution {
    public boolean canServe(int[] arr) {
        // code here
        if (arr[0] > 5) return false; // base case in which for the 1st customer 
        // if we don't have enough money then it is not possible 
        int five_count = 0;
        int tens_count = 0;
        for (int val : arr) {
            if (val == 5) five_count ++;
            else if (val == 10) {
                if (five_count < 1) return false;
                tens_count ++;
                five_count --;
            }
            else {
                if (five_count == 0) return false;
                else if (tens_count != 0) {
                    five_count --;
                    tens_count --;
                }
                else if (five_count <= 2) return false;
                else 
                    five_count -= 3;
            }
        }
        return true;
    }
}