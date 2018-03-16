package datastructures.stack;

public class Stack {

    private int size;
    private int[] stackArr;
    private int top;

    Stack(int size) {

        this.size = size;
        this.stackArr = new int[size];
        this.top = -1;

    }

    public void push(int n) throws Exception {

        if (this.isStackFull()) {

            throw new Exception("Stack is Full");
        }

        this.stackArr[++top] = n;

        System.out.println(n+" is pushed");

    }

    public void pop() throws Exception {

        if (this.isStackEmpty()) {

            throw new Exception("Stack is Empty");

        }

        int n = this.stackArr[top--];

        System.out.println(n+" is poped");
    }

    // returns true if stack is full
    public boolean isStackFull() {

        return (top == size - 1);
    }

    // returns true if stack is empty
    public boolean isStackEmpty() {

        return (top == -1);
    }

    public int peek(){

        return this.stackArr[top];

    }

    public static void main(String[] args) {

        Stack stack = new Stack(5);

        try {
            stack.push(4);
            stack.push(6);
            stack.push(4);
            stack.push(6);
            stack.push(4);
            stack.push(6);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        try {

            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

}
