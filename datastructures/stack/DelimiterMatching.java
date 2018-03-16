package datastructures.stack;

public class DelimiterMatching {
    
    // method to find : is delimiter is matching or not

    static boolean isDelimiterMatching(String inExpression){


        int stackSize = inExpression.length();
        StackImpli theStack = new StackImpli(stackSize);
        for (int j = 0; j < inExpression.length(); j++) {

            char ch = inExpression.charAt(j);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!theStack.isStackEmpty()) {
                        char stackContent = theStack.pop();
                        if ((ch == '}' && stackContent != '{')
                                || (ch == ']' && stackContent != '[')
                                || (ch == ')' && stackContent != '(')){
                            System.out.println("Mismatch found: " + ch + " at " + j);

                            return false;
                        }
                    } else {
                        System.out.println("Mismatch found: " + ch + " at " + j);

                        return false;
                    }

                    break;

                default: break;
            }
        }
        if (!theStack.isStackEmpty()){
            System.out.println("Error: missing right delimiter");
            return false;
        }
        return true;

    }

    // Main method

    public static void main(String[] args) {

        String expression = "{(a+b)*(c+d)}";

        System.out.println(isDelimiterMatching(expression));

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