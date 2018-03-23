package datastructures.tree;


class BinaryTree{

    // root node of binary tree
    Node root;

    BinaryTree() {

        root = null;

    }

    // method to recursively left - root - right
    void inOrder(Node root) {

        if (root == null) {

            return;
        }

        inOrder(root.left);

        System.out.print(root.data + " -> ");

        inOrder(root.right);
    }

    // method to recursively root - left - right
    void preOrder(Node root) {

        if (root == null) {

            return;
        }

        System.out.print(root.data + " -> ");

        preOrder(root.left);

        preOrder(root.right);

    }

    // method to recursively left - right - root
    void postOrder(Node root) {

        if (root == null) {

            return;
        }

        postOrder(root.left);

        postOrder(root.right);

        System.out.print(root.data + " -> ");

    }

}

// Implementation of binary tree
public class DFT {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        /*

                            1
                           / \
                          2   3
                         / \
                        4   5


         */

        System.out.println("Inorder Traversal");
        tree.inOrder(tree.root);

        System.out.println();

        System.out.println("Pre-order Traversal");
        tree.preOrder(tree.root);

        System.out.println();

        System.out.println("Post-order Traversal");
        tree.postOrder(tree.root);

    }
}
