package datastructures.tree;

// Algorithm runs of O(n^2) = O(n) + O(n-1) + O(n-2) + ....+ O(1) in recursion
// class to represent node
class Nodei{

    int data;
    Nodei left;
    Nodei right;

    Nodei(int data) {

        this.data = data;
        left = null;
        right = null;
    }

}

class BinaryTreei{

    Nodei root;

    BinaryTreei() {

        root = null;
    }
    // method to print breadth first traversal

    void printBreadthFirstTraversal() {

        int h = height(root);

        for (int i =1; i<= h; i++) {

            printGivenLevel(root, i);
        }
    }

    // compute the height of the tree
    int height(Nodei root) {

        if (root == null) {

            return 0;
        } else {

            int lheight = height(root.left);
            int rheight = height(root.right);

            if (lheight > rheight) {

                return lheight + 1;
            } else {
                return rheight + 1;
            }

        }
    }

    void printGivenLevel(Nodei root, int level) {

        if (root == null) {
            return;
        }

        if (level == 1) {
            System.out.print(root.data + " -> ");

        } else if (level > 1) {

            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level-1);
        }
    }



}

public class BFT {

    public static void main(String[] args) {

        BinaryTreei tree = new BinaryTreei();

        tree.root = new Nodei(1);
        tree.root.left = new Nodei(2);
        tree.root.right = new Nodei(3);
        tree.root.left.left = new Nodei(4);
        tree.root.left.right = new Nodei(5);

        System.out.println("Breadth First Traversal");
        tree.printBreadthFirstTraversal();
    }
}
