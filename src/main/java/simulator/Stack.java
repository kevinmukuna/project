package simulator;
import java.util.ArrayList;
import java.util.List;
/**
 * This is a stack class that delegate a stack elements, which consist of values passed and the next value,<br>
 * the class pushes new items to the top of stack and the class pop from the top of the stack, meaning the <br>
 * last entry is the first to come out and first entry is the last to come out
 * @author Kevin Mukuna <br> This is part of C3306 assigment 1 by Marc Van Dongen 2020/2021 this modules and assignement
 * was designed to get us familiar with some of the tools and version control used in work placement fields *
 * @param <E> The type of value stored in the stack
 */

// import stack.exception.StackEmptyException;
// import stack.exception.StackFullException;

public class Stack<E> {
    /**
     * @see #top --> this referes to the size of the stack. it initiated to zero upon creation.
     * @see #items --> this holds the stack of whatever object we decide to pass into the array.
     */

    private List<E> items;
    private int top;

    Stack() {
        top = 0;
        items = new ArrayList<E>();
     }

    /**
     * this method takes a value/object of type T and pushes it  ot the top of the stack.
     * @param e the value being pushed to the top of the stack
     */
    public void push(E e) {
        items.add(top++, e);
    }
    /**
     * pops the items on the top of the stack and the previous item becomes the item on top.
     * @return delete the top of the stack
     */
    public E pop() {
        if (isEmpty()) {
            return errorMessage();
        }
            return items.remove(--top);


    }
    /**
     * returns the item on top of the stack, the most recently pushed item.
     * @return the top of the stack
     */
    public E peek()  {
        if (isEmpty()) {
            return errorMessage();
        }
        else {
            return items.get(top - 1);
        }

    }

    /**
     *  this method prints each item in a new line, till the stack is empty.
     *  makes a copy of the stack and prints out items one by one as long as it has nextvalue
     */
    public void show() {
        System.out.println("Stack elements:");
        for (E e : items) {
            System.out.println(e);
        }
    }

    /**
     * returns a bool if the stack is empty or not.
     * @return bool true or false on whether the stack is empty or not
     */
    boolean isEmpty() {
        return top <= 0;
    }

    /**
     * this is used to return an exception when an unexpected execution is  requested
     * @return an error message
     */
    @SuppressWarnings("unchecked")
    public E errorMessage (){
        return (E) "Sorry Stack is Empty";
    }

    /**
     * this method calls in the constructor which then initialises the stack.
     * initialisation of the stack method
     */
    public void init(){
        while(!isEmpty()){
            pop();
        }
        new Stack<>();
    }

    /**
     * returns the size of the stack
     * @return size of the stack
     */
    public int getSize(){
        return items.size();
    }
}
 
 


