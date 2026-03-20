/*
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        Node predecessor = null, successor = null, temp = root;
        while (temp != null) {
            if (temp.data >= key) 
                temp = temp.left;
            else {
                predecessor = temp;
                temp = temp.right;
            }
        }
        temp = root;
        while (temp != null) {
            if (key >= temp.data) 
                temp = temp.right;
            else {
                successor = temp;
                temp = temp.left;
            }
        }
        return new ArrayList<>(Arrays.asList(predecessor, successor));
    }
}