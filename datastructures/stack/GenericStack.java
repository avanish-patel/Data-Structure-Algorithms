package datastructures.stack;


public class GenericStack<T>  {

    private int size;
    private T[] stackArr;
    private int top;


    GenericStack(int size) {

        this.size = size;
        this.stackArr = (T[]) new Object[size];
        this.top = -1;

    }

    public void push(T in) throws Exception{

        if (this.isStackFull()) {

            System.out.println("stack is full, capacity is increased");

            this.increaseCapacity();

        }

        this.stackArr[++top] = in;

        System.out.println(in +" pushed");
    }

    public T peek() {

        return stackArr[top];
    }

    public T pop() throws Exception{

        if (this.isStackEmpty()) {

            throw new Exception("Stack is empty");

        }

        T n = this.stackArr[top--];

        System.out.println(n+ " poped");
        return n;
    }

    // method to double the capacity of stack
    public void increaseCapacity() {

        T[] newStack = (T[])new Object[this.size * 2];

        for(int i=0; i<size; i++) {

            newStack[i] = this.stackArr[i];
        }

        this.stackArr = newStack;
        this.size = this.size * 2;


    }



    public boolean isStackFull() {

        return (top == size - 1);
    }

    public boolean isStackEmpty() {

        return (top == -1);
    }


    public static void main(String[] args) {

        GenericStack<String> gs= new GenericStack<String>(3);

        try {
            gs.push("kfld");
            gs.push("jfd");
            gs.push("jfkld");
            gs.push("fdk");
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        try {
            gs.pop();
            gs.pop();
            gs.pop();
            gs.pop();
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }


        GenericStack<Integer> gs1= new GenericStack<Integer>(3);

        try {
            gs1.push(7);
            gs1.push(8);
            gs1.push(9);
            gs1.push(10);
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        try {
            gs1.pop();
            gs1.pop();
            gs1.pop();
            gs1.pop();
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}
