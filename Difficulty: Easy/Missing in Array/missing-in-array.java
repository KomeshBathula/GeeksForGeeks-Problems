class Solution {
    int missingNum(int arr[]) {
        // code here
        long n = arr.length + 1;
        long s1 = (n*(n+1)) / 2;
        long s2 = 0;
        for(int i=0;i<arr.length;i++) s2+=arr[i];
        return (int)(s1-s2);

    }
}