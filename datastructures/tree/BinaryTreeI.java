package datastructures.tree;

class BinaryTreeI {

    Node root;

    BinaryTreeI(){

        root = null;
    }

    BinaryTreeI(int data) {

        root = new Node(data);
    }

    public static void main(String[] args) {


        BinaryTreeI tree = new BinaryTreeI();

        tree.root = new Node(4);

        tree.root.left = new Node(8);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(9);
        tree.root.left.right = new Node(7);



    }



}
