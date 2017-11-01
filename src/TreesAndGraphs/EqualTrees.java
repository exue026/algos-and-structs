package TreesAndGraphs;

public class EqualTrees {

    public static void main(String[] args) {

    }

    /**
     * Write a function that determines if two binary trees are identical
     */

    static boolean identicalTrees(BST tree1, BST tree2) {
        return identicalTrees(tree1.getRoot(), tree2.getRoot());
    }

    static boolean identicalTrees(BST.Node root1, BST.Node root2) {
        return root1.getValue() == root2.getValue()
                && identicalTrees(root1.getLeft(), root2.getLeft())
                && identicalTrees(root1.getRight(), root2.getRight());
    }

}
