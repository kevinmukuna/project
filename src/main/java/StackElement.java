/**
 * @Author Kevin Mukuna
 * @param <T>, the type of the value being stored in the stack
 */
public class StackElement<T> {

    T valuePassed;
    StackElement<T> nextValue;

    /**
     *
     * @param valuePassed
     * @param nextValue
     */
    public StackElement(T valuePassed, StackElement<T> nextValue){
        this.valuePassed = valuePassed;
        this.nextValue = nextValue;

    }

    public StackElement<T> getnext() {
        return nextValue;
    }

    public T getvalue() {
        return valuePassed;
    }


}
