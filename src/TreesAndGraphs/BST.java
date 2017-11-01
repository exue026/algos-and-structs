package TreesAndGraphs;

public class BST {

    public class Node {

        private String value;
        private Node left;
        private Node right;

        public Node(String value) {
            this.value = value;
        }

        String getValue() {
            return value;
        }

        void setLeft(Node left) { this.left = left; }
        Node getLeft() { return left; }

        void setRight(Node left) { this.right = right; }
        Node getRight() { return right; }

    }

    private Node root;

    public BST() {
        root = null;
    }

    public BST(String value) {
        root = new Node(value);
    }

    Node getRoot() {
        return root;
    }

}
