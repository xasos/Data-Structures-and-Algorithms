package stackArray;

import java.util.Arrays;

public class StackArray {

    private String[] anArray;
    private int stackSize;
    private int topOfStack = -1;
    
    StackArray(int size) {
        stackSize = size;        
        anArray = new String[size];
        Arrays.fill(anArray, "-1"); // "-1" will represent an empty value in the stack
    }
    
    public void push(String value) {
        if (topOfStack + 1 < stackSize) {
            topOfStack++;
            anArray[topOfStack] = value;
            System.out.println("\"" + value + "\" added to the stack!");
        } else {
            System.out.println("Stack is full");
        }
    }
    
    public void pop() {
        if (topOfStack > -1) {
            anArray[topOfStack] = "-1";
            topOfStack--;
            System.out.println("Last value popped from stack!");
        } else {
            System.out.println("Stack is empty");
        }
    }
    
    public void peak() {
        if (anArray[topOfStack] != null) {
            System.out.println("Peak of stack is: " + anArray[topOfStack]);
        } else {
            System.out.println("Stack is empty");
        }
    }
    
    public void printStack() {
        System.out.print("Stack is: ");
        for (String str : anArray) {
            System.out.print("[" + str + "]");
        }
    }
    
    
    public static void main(String[] args) {
        StackArray aStack = new Stack(10); // Construct a stack with 10 elements
        aStack.push("String #1");
        aStack.push("String #2");
        aStack.pop();
        aStack.push("String #3");
        aStack.peak();
        aStack.printStack();      
    }
    
}
