package datastructures.stack;

public class DynamicStack {

    private int size;
    private int[] stackArr;
    private int top;


    DynamicStack(int size) {

        this.size = size;
        this.stackArr = new int[size];
        this.top = -1;

    }

    private void increaseSize() {

        int[] newStack = new int[this.size *2];

        for (int i=0; i< size;i++) {

            newStack[i] = this.stackArr[i];
        }

        this.stackArr = newStack;
        this.size = size*2;
    }


    public void push(int n){

        if (this.isStackFull()) {

            System.out.println("Stack is full , increasing it's size");

            this.increaseSize();
        }

        this.stackArr[++top] = n;

        System.out.println(n+ "Pushed");
    }

    public void pop() throws Exception {

        if (this.isStackEmpty()) {

            throw new Exception("Stack is empty...");
        }

        int n = this.stackArr[top--];
        System.out.println(n+" Poped");

    }

    public boolean isStackFull() {

        return (top == size - 1);
    }

    public boolean isStackEmpty() {

        return (top == -1);
    }


    public static void main(String[] args) {


        DynamicStack ds = new DynamicStack(2);

        for (int i =0; i< 20; i++) {

            ds.push(i);
        }

        for (int i=0; i< 21; i++) {

            try {
                ds.pop();
            } catch (Exception e) {

                System.out.println(e.getMessage());
            }
        }

    }
}
