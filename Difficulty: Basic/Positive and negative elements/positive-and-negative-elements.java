// User function Template for Java

class Solution {
    ArrayList<Integer> arranged(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>(arr);
        int posIndex = 0, negIndex = 1;
        for(int i = 0;i<arr.size();i++){
            if(arr.get(i)>0){
                list.set(posIndex, arr.get(i));
                posIndex += 2;
            }
            else{
                list.set(negIndex, arr.get(i));
                negIndex += 2;
            }
        }
        return list;
    }
}
