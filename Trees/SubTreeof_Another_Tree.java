package Trees;

/**
 * The `SubTreeof_Another_Tree` class checks if one binary tree is a subtree of
 * another binary tree.
 */
public class SubTreeof_Another_Tree {
    /**
     * Node represents a node in a binary tree.
     */
    public static class Node {
        int data;
        Node leftChild;
        Node rightChild;

        /**
         * Constructor to initialize a Node with data.
         *
         * @param data The data value to be stored in the node.
         */
        Node(int data) {
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    /**
     * Checks if two binary trees are identical.
     *
     * @param node    The current node in the main tree.
     * @param subroot The current node in the subtree being compared.
     * @return true if the trees are identical, false otherwise.
     */
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

    /**
     * Checks if the second binary tree is a subtree of the first binary tree.
     *
     * @param root    The root node of the main tree.
     * @param Subroot The root node of the subtree being checked.
     * @return true if the subtree exists in the main tree, false otherwise.
     */
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

    /**
     * Main method for testing the isSubtree function with a sample binary tree and
     * subtree.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Node root = new Node(1);
        root.leftChild = new Node(2);
        root.rightChild = new Node(3);
        root.leftChild.leftChild = new Node(4);
        root.leftChild.rightChild = new Node(5);
        root.rightChild.leftChild = new Node(6);
        root.rightChild.rightChild = new Node(7);

        // Define a subtree
        Node SubRoot = new Node(2);
        SubRoot.leftChild = new Node(4);
        SubRoot.rightChild = new Node(5);

        boolean isSubtree = isSubtree(root, SubRoot);
        System.out.println(isSubtree);
    }
}
