package tree;

public class BinarySearchTree {

    private Node root;

    private static class Node {

        private int value;
        private Node left;
        private Node right;

        private Node(int value) {
            this.value = value;
        }
    }

    public void insert(int value) {

        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node node, int value) {

        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insertRecursive(node.left, value);
        } else if (value > node.value) {
            node.right = insertRecursive(node.right, value);
        }

        return node;
    }

    public boolean contains(int value) {

        return containsRecursive(root, value);
    }

    private boolean containsRecursive(Node node, int value) {

        if (node == null) {
            return false;
        }

        if (node.value == value) {
            return true;
        }

        if (value < node.value) {
            return containsRecursive(node.left, value);
        }

        return containsRecursive(node.right, value);
    }

    public void inOrder() {

        inOrderRecursive(root);

        System.out.println();
    }

    private void inOrderRecursive(Node node) {

        if (node == null) {
            return;
        }

        inOrderRecursive(node.left);

        System.out.print(node.value + " ");

        inOrderRecursive(node.right);
    }

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.print("In-order: ");
        tree.inOrder();

        System.out.println(
                "Contains 60: " + tree.contains(60)
        );

        System.out.println(
                "Contains 100: " + tree.contains(100)
        );
    }
}
