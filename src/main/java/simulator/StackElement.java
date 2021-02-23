package simulator;

/**
 * The purpose of this class is to delegate to the element, so as in to able to create multiple types,primitive type
 * without the need to change the whole code over and over again, this class is generic of type T
 * @author Kevin Mukuna <br> This is part of C3306 assigment 1 by Marc Van Dongen 2020/2021 this modules and assignement
 * was designed to get us familiar with some of the tools and version control used in work placement fields
 * @param <T>, the type of the value being stored in the stack
 */
public class StackElement<T> {
    T valuePassed;
    StackElement<T> nextValue;

    /**
     *
     * @param valuePassed the value being pushed to the top of the stack
     * @param nextValue the next value to be pushed to teh top of the stack (being a stackelement of T )
     */
    public StackElement(T valuePassed, StackElement<T> nextValue){
        this.valuePassed = valuePassed;
        this.nextValue = nextValue;

    }

    /**
     * @return the previous value before the current passed value, the value just below the top value of top
     */
    public StackElement<T> getnext() {
        return nextValue;
    }

    /**
     * @return the value being passed or the value on top of the stack
     */
    public T getvalue() {
        return valuePassed;
    }

}
