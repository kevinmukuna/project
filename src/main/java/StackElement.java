/**
 * the purpose of this class is to delegate to the element, so as in to able to create multiple types,premitive type
 * without the need to change the whole code over and over again--> this class is generic of type T
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
