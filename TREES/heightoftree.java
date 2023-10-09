package Trees;

/**
 * This class represents a binary tree and provides methods to perform various
 * operations on the tree.
 */
public class heightoftree {

    /**
     * Represents a node in the binary tree.
     */
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * Calculates and returns the height of the binary tree rooted at the given
     * node.
     *
     * @param root The root node of the binary tree.
     * @return The height of the tree.
     */
    public static int Height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    /**
     * Counts and returns the number of nodes in the binary tree rooted at the
     * given node.
     *
     * @param root The root node of the binary tree.
     * @return The count of nodes in the tree.
     */
    public static int count(Node root) {
        if (root == null) {
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }

    /**
     * Calculates and returns the sum of values of all nodes in the binary tree
     * rooted at the given node.
     *
     * @param root The root node of the binary tree.
     * @return The sum of node values in the tree.
     */
    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    }

    /**
     * Calculates and returns the diameter of the binary tree using the first
     * approach.
     *
     * @param root The root node of the binary tree.
     * @return The diameter of the tree.
     */
    public static int Diameter2(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);
        int selfDiameter = leftHeight + rightHeight + 1;
        int leftDiameter = Diameter2(root.left);
        int rightDiameter = Diameter2(root.right);
        return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
    }

    /**
     * Represents information about the diameter and height of a subtree.
     */
    static class Info {
        int diam;
        int ht;

        Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    /**
     * Calculates and returns the diameter and height of the binary tree using the
     * second approach.
     *
     * @param root The root node of the binary tree.
     * @return An Info object containing diameter and height information.
     */
    public static Info Diameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = Diameter(root.left);
        Info rightInfo = Diameter(root.right);
        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht) + 1;
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        return new Info(diam, ht);
    }

    /**
     * The main method to test the binary tree operations.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height of tree is: " + Height(root));
        System.out.println("Count of nodes is: " + count(root));
        System.out.println("Sum of nodes data is: " + sum(root));
        System.out.println("Diameter of tree in approach one is: " + Diameter2(root));
        System.out.println("Diameter of tree in approach two (height) is: " + Diameter(root).ht);
        System.out.println("Diameter of tree in approach two (diameter) is: " + Diameter(root).diam);
    }
}
