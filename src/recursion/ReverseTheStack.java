package recursion;

import java.util.Stack;

public class ReverseTheStack {
    public static void main(String[] args) {
        ReverseTheStack solution = new ReverseTheStack();
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(2);
        System.out.print("Original Stack: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(2);
        solution.reverseStack(stack);

        // Print the sorted stack
        System.out.print("Reverse Stack: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    private void reverseStack(Stack<Integer> stack) {
        if(stack.isEmpty())return;
        int val= stack.pop();
        reverseStack(stack);
        bottomInsert(stack, val);
    }

    private void bottomInsert(Stack<Integer> stack, int val) {
        if(stack.isEmpty()){
            stack.push(val);
            return;
        }
        int topVal= stack.pop();
        bottomInsert(stack, val);
        stack.push(topVal);
    }
}
