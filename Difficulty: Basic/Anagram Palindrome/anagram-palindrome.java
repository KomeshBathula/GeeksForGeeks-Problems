class Sol {
    int isPossible(String S) {
        // your code here
        int freq[] = new int[26];
        for(int i = 0;i<S.length();i++){
            char ch = S.charAt(i);
            freq[ch-'a']++;
        }
        int countOfOdd = 0;
        for(int i = 0;i<freq.length;i++){
            if(freq[i] % 2 != 0) countOfOdd++;
        }
        if(countOfOdd>1) return 0;
        return 1;
    }
}