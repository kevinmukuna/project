package simulator;

/**
 * the method below are abstract methods that are implemented in the stack class
 * @author Kevin Mukuna <br> This is part of C3306 assigment 1 by Marc Van Dongen 2020/2021 this modules and assignement
 * was designed to get us familiar with some of the tools and version control used in work placement fields
 * @param <T> T stands for type of items being placed on the stack
 */
public interface StackInterface<T> {

    /**
     * @see simulator.Stack#push(Object)
     * @param value the item being pushed to the top of the stck
     */
    public void push(T value);

    /**
     * @see simulator.Stack#top()
     * @return type T of the item on top
     */
    public T top();

    /**
     * @see simulator.Stack#pop()
     * @return type T of the new item on top after removing the previous top item
     */
    public T pop();

    /**
     * @see simulator.Stack#show()
     */
    public void show();
}
