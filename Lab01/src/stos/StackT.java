package stos;
/**
 *
 * @author mateu
 */
public class StackT implements IStack {
    
    int[] stack;
    int stackTop;
    
    public StackT(int stackLength) {
        stack = new int[stackLength-1];
        stackTop = 0;
    }
    @Override
    public void push(int dane) {
        stack[stackTop] = dane;
        stackTop++;
    }

    @Override
    public void pop() {
        if(stackTop>=0) {
        stack[stackTop] = 0;
        stackTop--;
        }
        else {System.err.println("Stack is empty");}
        
    }

    @Override
    public int top() {    
        return stack[stackTop-1];
    }

    @Override
    public boolean isEmpty() {
        return stack[0]==0;
    }
    public void displayStackContent() {
        for(int x : stack) {
            System.out.println(x);
        }
}
    
}
