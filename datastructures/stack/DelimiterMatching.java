package datastructures.stack;

public class DelimeterMatching {
    
    // method to find : is delimeter is matching or not

    public static void main(String[] args) {


    }
}


// implementation of stack
class StackImpli{

    private int size;
    private char[] stackArr;
    private int top;

    StackImpli(int size) {

        this.size = size;
        this.stackArr = new char[size];
        this.top = -1;
    }

    public void push(char entery) {

        this.stackArr[++top] = entery;
    }

    public char pop() {

        char entery = this.stackArr[top++];
        return entery;

    }

    public char peek(){

        return stackArr[top];
    }

    public boolean isStackEmpty(){

        return (top == -1 );
    }

    public boolean isStackFull() {

        return (top == size - 1);
    }

}