/**
 * A class to find and print nodes at the Kth level of a binary tree.
 */
public class Kth_Levelof_Tree {
    /**
     * Inner class representing a node in the binary tree.
     */
    public static class Node {
        int data;
        Node left;
        Node right;

        /**
         * Constructor to create a new node with the given data.
         *
         * @param data The data to be stored in the node.
         */
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * Recursively prints nodes at the Kth level of the binary tree.
     *
     * @param root  The root node of the binary tree.
     * @param level The current level in the tree (starts at 1 for the root).
     * @param k     The target level to print nodes from.
     */
    public static void Klevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data + " ");
        }
        Klevel(root.left, level + 1, k);
        Klevel(root.right, level + 1, k);
    }

    /**
     * The main method creates a sample binary tree and prints nodes at the Kth
     * level.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create a sample binary tree.
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 3; // The level to print nodes from.
        System.out.print("Nodes at level " + k + ": ");
        Klevel(root, 1, k);
    }
}
