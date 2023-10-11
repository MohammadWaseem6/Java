import java.util.*;

/**
 * The TopViewOfTree class is used to find and print the top view of a binary
 * tree.
 * The top view of a binary tree is the set of nodes visible when the tree is
 * viewed from the top.
 * It means the nodes that would be encountered first when we look at the tree
 * from the top, considering
 * the horizontal distance (hd) of each node from the root node.
 *
 * The class includes a static method `topView` which takes the root node of the
 * binary tree as input and
 * prints the top view of the tree.
 *
 * The binary tree is represented using a nested Node class, where each Node has
 * an integer data value,
 * a leftChild reference to the left subtree, and a rightChild reference to the
 * right subtree.
 *
 * The algorithm uses a level order traversal (BFS) approach to traverse the
 * tree and store the nodes
 * at each horizontal distance (hd) from the root in a HashMap. Then it prints
 * the nodes in the HashMap
 * in the order of their horizontal distance, giving us the top view of the
 * tree.
 *
 * Usage:
 * Node root = new Node(1);
 * root.leftChild = new Node(2);
 * root.rightChild = new Node(3);
 * root.leftChild.leftChild = new Node(4);
 * root.leftChild.rightChild = new Node(5);
 * root.rightChild.leftChild = new Node(6);
 * root.rightChild.rightChild = new Node(7);
 * TopViewOfTree.topView(root);
 */
public class TopViewOfTree {
    /**
     * Nested Node class to represent a node in the binary tree.
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
     * Nested Info class to store information about a node during traversal.
     * It contains a reference to the node and its horizontal distance (hd) from the
     * root.
     */
    static class Info {
        Node node;
        int hd;

        /**
         * Constructor to initialize Info with a node and its horizontal distance.
         *
         * @param node The node being processed.
         * @param hd   The horizontal distance of the node from the root.
         */
        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    /**
     * Method to find and print the top view of a binary tree.
     *
     * @param root The root node of the binary tree.
     */
    public static void topView(Node root) {
        // Check if the root is null.
        if (root == null) {
            return;
        }

        // Initialize a queue for level order traversal and a HashMap to store nodes by
        // horizontal distance.
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;

        // Add the root node to the queue with horizontal distance 0 and a null marker.
        q.add(new Info(root, 0));
        q.add(null);

        // Perform level order traversal.
        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                // If the current node is a null marker, add another null marker if the queue is
                // not empty.
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                // Process the current node.
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.leftChild != null) {
                    // Add the left child with adjusted horizontal distance and update min.
                    q.add(new Info(curr.node.leftChild, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.rightChild != null) {
                    // Add the right child with adjusted horizontal distance and update max.
                    q.add(new Info(curr.node.rightChild, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }

        // Print the top view nodes in the order of their horizontal distance.
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    /**
     * Main method for testing the topView function with a sample binary tree.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a sample binary tree.
        Node root = new Node(1);
        root.leftChild = new Node(2);
        root.rightChild = new Node(3);
        root.leftChild.leftChild = new Node(4);
        root.leftChild.rightChild = new Node(5);
        root.rightChild.leftChild = new Node(6);
        root.rightChild.rightChild = new Node(7);

        // Find and print the top view of the tree.
        topView(root);
    }
}
