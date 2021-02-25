package simulator;
/**
 * This is a stack class that delegate a stack elements, which consist of values passed and the next value,<br>
 * the class pushes new items to the top of stack and the class pop from the top of the stack, meaning the <br>
 * last entry is the first to come out and first entry is the last to come out
 * @author Kevin Mukuna <br> This is part of C3306 assigment 1 by Marc Van Dongen 2020/2021 this modules and assignement
 * was designed to get us familiar with some of the tools and version control used in work placement fields *
 */
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

     }
}

