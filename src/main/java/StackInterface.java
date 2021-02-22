/**
 * the method below are abstract methods that are implemented in the stack class
 * @param <T> T stands for type of items being placed on the stack
 */
public interface StackInterface<T> {
    public void push(T value);
    public T top();
    public T pop();
    public void show();
}
