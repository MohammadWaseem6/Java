public class BuildTreePreOrder {
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

    static class BinaryTree {
        static int indx = -1;

        public Node buildtree(int nodes[]) {

            indx++;
            if (nodes[indx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[indx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode;
        }

        public static void PreOrder(Node root) {
            if (root == null) {
                return;
            }
           // System.out.print(root.data + " ");//preorder traversal
            PreOrder(root.left);
           // System.out.print(root.data + " ");//inordersal
            PreOrder(root.right);
           System.out.print(root.data + " ");//postorder traversal
        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree Tree = new BinaryTree();
        Node root = Tree.buildtree(nodes);
        Tree.PreOrder(root);
    }

}