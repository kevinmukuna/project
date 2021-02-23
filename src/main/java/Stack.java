/**
 * this is a stack class that delegate a stack elements, which consist of values passed and the next value,
 * the class pushes new items to the top of stack and
 * the class pop from the top of the stack, meaning the last entry is the first to come out and first entry is the
 * last to come out
 * @param <T> the T stands for type
 */
public class Stack<T> implements StackInterface<T>{
    /**
     * @see #size --> this referes to the size of the stack. it initiated to zero upon creation.
     * @see StackElement --> this holds the stack of whatever object we decide to pass into the array.
     * @see Stack --> the constructor is used for initialisation of an empty stack.
     * @see #push(T Object) --> this method takes a value/object of type T and pushes it  ot the top of the stack.
     * @see #pop() --> pops the items on the top of the stack and the previous item becomes the item on top.
     * @see #top() --> returns the item on top of the stack, the most recently pushed item.
     * @see #init() --> this method calls in the constructor which then initialises the stack.
     * @see #show() --> this method prints each item in a new line, till the stack is empty.
     * @see #isStackEmpty() --> returns a bool if the stack is empty or not.
     * @see #errorMesage() --> this is used to return an exception when an unexpected execution is  requested.
     * @see #getSize() --> returns the size of the stack.
     */
    private int size;
    StackElement<T> top;

    // ----------------------------stack functional method----------------------------
    public Stack() {
        size = -1;
        top = null;
    }

    /**
     * this method takes a value/object of type T and pushes it  ot the top of the stack.
     * @param valuePassed the value being pushed to the top of the stack
     */
    public void push(T valuePassed) {
        top = new StackElement<>(valuePassed, top);
        size++;
    }

    /**
     * pops the items on the top of the stack and the previous item becomes the item on top.
     * @return delete the top of the stack
     */
    public T pop() {
        StackElement<T> previousTop = top;
        if ( isStackEmpty() || top == null ){
            return errorMesage();
        }
        top = top.getnext();
        return previousTop.getvalue();
    }

    /**
     * returns the item on top of the stack, the most recently pushed item.
     * @return the top of the stack
     */
    public T top() {

        if ( isStackEmpty() || top == null ){
            return errorMesage();
        }
        return top.getvalue();
    }

    /**
     * this method calls in the constructor which then initialises the stack.
     * initialisation of the stack method
     */
    public void init() {
        new Stack<>();
    }

    /**
     *  this method prints each item in a new line, till the stack is empty.
     *  makes a copy of the stack and prints out items one by one as long as it has nextvalue
     */
    public void show() {
        StackElement<T> stackCOpy = top;
        while (stackCOpy.nextValue != null ){
            System.out.println(stackCOpy.valuePassed);
            stackCOpy = stackCOpy.nextValue;
        }
        System.out.println(stackCOpy.valuePassed);
    }

    // ---------------------------extra method------------------------

    /**
     * returns a bool if the stack is empty or not.
     * @return bool true or false on whether the stack is empty or not
     */
    public boolean isStackEmpty() {
        return size <= -1;
    }

    /**
     * this is used to return an exception when an unexpected execution is  requested
     * @return an error message
     */
    public T errorMesage (){
        return (T) "Sorry Stack is Empty";
    }

    /**
     * returns the size of the stack
     * @return size of the stack
     */
    public int getSize() {
        return size+1;
    }


    public static void main(String[] args){

        Stack<String> newStringStack = new Stack<>();
        newStringStack.push("Kevin ");
        newStringStack.push("Mukuna ");
        newStringStack.push("Junior ");
        newStringStack.push("Patrick ");
        newStringStack.show();
        System.out.println();
        newStringStack.pop();

        newStringStack.show();
        newStringStack.pop();
        System.out.println();

        newStringStack.show();
        newStringStack.pop();
        System.out.println();



    }
}
