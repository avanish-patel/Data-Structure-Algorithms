package datastructures.stack;

public class ReverseString {

    // method to reverse a string

    public static String reverse(String word) {

        StringBuilder sb = new StringBuilder();

        int size = word.length();

        StackImpl stack = new StackImpl(size);

        for (int i=0; i<size; i++) {

            stack.push(word.charAt(i));
        }

        while (!stack.isStackEmpt()) {

            sb.append(stack.pop());
        }

        return sb.toString();


    }

    public static void main(String[] args) {


        System.out.println("Java == "+ reverse("Java") );

        System.out.println("Khushbu == "+ reverse("Khushbu"));


    }
}

// class to implement stack
class StackImpl{

    private int size;
    private int top;
    private char[] stackArr;

    StackImpl(int size) {

        this.size = size;
        this.top = -1;
        this.stackArr = new char[size];

    }

    public void push(char entery) {

        this.stackArr[++top] = entery;
    }

    public char pop() {

        char entery = this.stackArr[top--];

        return entery;
    }

    public char peek(){

        return stackArr[top];
    }

    public boolean isStackFull() {

        return (top == size - 1);
    }

    public boolean isStackEmpt(){

        return (top == -1);
    }

}