package datastructures.tree;

import java.util.LinkedList;
import java.util.Queue;

// this will run on O(n)
class Nodej{

    int data;
    Nodej left;
    Nodej right;

    Nodej(int data) {

        this.data = data;
        left = null;
        right = null;
    }
}


class BFS1 {


    Nodej root;


    // method to print level order traversal or BFT
    void printLevelOrder() {

        Queue<Nodej> queue = new LinkedList<Nodej>();

        queue.add(root);

        // loop to go to each level and enqueue their left and right childs
        while (!queue.isEmpty()) {

            Nodej temp = queue.poll();

            System.out.print(temp.data + " ");

            // enqueue left child

            if (temp.left != null) {

                queue.add(temp.left);
            }

            // enqueue right child

            if (temp.right != null) {

                queue.add(temp.right);
            }
        }
    }



    public static void main(String[] args) {

        BFS1 tree = new BFS1();

        tree.root = new Nodej(1);
        tree.root.left = new Nodej(2);
        tree.root.right = new Nodej(3);
        tree.root.left.left = new Nodej(4);
        tree.root.left.right = new Nodej(5);

        System.out.println("Level Order Traversal");

        tree.printLevelOrder();

    }
}
