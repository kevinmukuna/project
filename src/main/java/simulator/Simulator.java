package simulator;
// import Stack;
public class Simulator {

 
    public static void main(String[] args) {

        Stack<Integer> customStack = new Stack<Integer>();
        customStack.push(5);
        customStack.push(6);
        customStack.push(7);
        customStack.show();
        customStack.pop();
        customStack.show();
        customStack.push(7);
        customStack.push(8);
        customStack.push(9);
        // test for runtime exception(stack full) customStack.push(10);
        customStack.show();
        customStack.pop();
        customStack.show();
        customStack.pop();
        customStack.pop();
        customStack.pop();
        customStack.show();
        customStack.push(10);
        System.out.println("latest element:" + customStack.peek());
        customStack.show();
        customStack.pop();
        customStack.pop();
     // test for runtime exception(stack empty) customStack.pop();
     
     }
}

