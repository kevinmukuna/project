package simulator;

/**
 * This is a stack class that delegate a stack elements, which consist of values passed and the next value,<br>
 * the class pushes new items to the top of stack and the class pop from the top of the stack, meaning the <br>
 * last entry is the first to come out and first entry is the last to come out
 * @author Kevin Mukuna <br> This is part of C3306 assigment 1 by Marc Van Dongen 2020/2021 this modules and assignement
 * was designed to get us familiar with some of the tools and version control used in work placement fields *
 * @param <T> The type of value stored in the stack
 */


import java.util.ArrayList;
import java.util.List;
 
// import stack.exception.StackEmptyException;
// import stack.exception.StackFullException;
 
public class Stack<E> {
 
    private List<E> items;
    private int top;
     
    Stack() {
        top = 0;
        items = new ArrayList<E>();
     }
     
    public void push(E e) {
        items.add(top++, e);
    }
     
    public E pop() {
        if (isEmpty()) {
            errorMessage();
        } 
            return items.remove(--top);
        
     
    }
     
    public E peek()  {
        if (isEmpty()) {
            errorMessage();
        } 
            return items.get(top - 1);
        
    }
     
    public void printStack() {
        System.out.println("Stack elements:");
        for (E e : items) {
            System.out.println(e);
        }
    }
     
    private boolean isEmpty() {
        if (top <= 0) {
            return true;
        }
        return false;
    }

    public void errorMessage(){
         System.out.println("stack is empty. nothing to give");
    }
     
}
 
 


