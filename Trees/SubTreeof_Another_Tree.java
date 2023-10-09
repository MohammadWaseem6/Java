package Trees;

public class SubTreeof_Another_Tree {
    public static class Node {
        int data;
        Node leftChild;
        Node rightChild;

        Node(int data) {
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    public static boolean isIdentical(Node node, Node subroot) {
        if (node == null && subroot == null) {
            return true;
        } else if (node == null || subroot == null || node.data != subroot.data) {
            return false;
        }
        if (!isIdentical(node.leftChild, subroot.leftChild)) {
            return false;
        }
        if (!isIdentical(node.rightChild, subroot.rightChild)) {
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root, Node Subroot) {
        if (root == null) {
            return false;
        }
        if (root.data == Subroot.data) {
            if (isIdentical(root, Subroot)) {
                return true;
            }
        }
        return isSubtree(root.leftChild, Subroot) || isSubtree(root.rightChild, Subroot);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.leftChild = new Node(2);
        root.rightChild = new Node(3);
        root.leftChild.leftChild = new Node(4);
        root.leftChild.rightChild = new Node(5);
        root.rightChild.leftChild = new Node(6);
        root.rightChild.rightChild = new Node(7);
        // subRoot
        Node SubRoot = new Node(2);
        SubRoot.leftChild = new Node(4);
        SubRoot.rightChild = new Node(5);

        System.out.println(isSubtree(root, SubRoot));

    }
}
