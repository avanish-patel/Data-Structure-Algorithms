package datastructures.tree;

import java.util.Stack;

// Implementation of Node
class Nodek{

    int data;
    Nodek left;
    Nodek right;

    Nodek(int data) {

        this.data = data;
        left = null;
        right = null;
    }
}

// class with main method
public class InOrderNoRecursion {

    //define root node
    Nodek root;

    // method to print inorder traversal
    void inOrder() {

        if (root == null){

            return;
        }

        Stack<Nodek> stack = new Stack<Nodek>();

        Nodek current = root;

        while (current != null) {

            stack.push(current);
            current = current.left;

        }

        while (stack.size() > 0) {

            current = stack.pop();

            System.out.print(current.data + " -> ");

            if (current.right != null) {

                current = current.right;

                while (current != null) {

                    stack.push(current);
                    current = current.left;
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        InOrderNoRecursion tree = new InOrderNoRecursion();

        tree.root = new Nodek(1);
        tree.root.left = new Nodek(2);
        tree.root.right = new Nodek(3);

        tree.root.left.left = new Nodek(4);
        tree.root.left.right = new Nodek(5);

        System.out.println("In-Order Travesal without recursion : ");
        tree.inOrder();

    }
}
