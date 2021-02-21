public class Stack<T>{

    private int size;
    StackElement<T> top;

    // stack functional method
    public Stack() {
        size = -1;
        top = null;
    }

    public void push(T valuePassed) {
        top = new StackElement<>(valuePassed, top);
        size++;

        /* this can also be written this way
            StackElement<T> newStackElement = new StackElement<>(valuePassed, top);
            top = newStackElement;
            size++;
         */
    }

    public T pop() {
        StackElement<T> previousTop = top;
        if (!isStackEmpty()){
            return errorMesage();
        }
        top = top.getnext();
        return previousTop.getvalue();
    }

    public T top() {

        if (!isStackEmpty()){
            return errorMesage();
        }
        return top.getvalue();
    }

    public void init() {
        size = 0;
        top = null;
    }

    public void show() {

        do {
            System.out.println(top());
            pop();
            size--;
        }
        while ( isStackEmpty() );
    }

    // extra method
    public boolean isStackEmpty() {
        return size > -1;
    }

    public T errorMesage (){
        return (T) "Sorry Stack is Empty";
    }

    public static void main(String[] args){
//        ST<String> newStringStack = new ST<>();
//        newStringStack.push("Kevin ");
//        newStringStack.push("Mukuna ");
//        newStringStack.push("Junior ");
//        newStringStack.push("Patrick ");
////        newStringStack.pop();
////        System.out.println(newStringStack.top());
////        newStringStack.show();
////        newStringStack.pop();
////        System.out.println(newStringStack.top());
////        System.out.println(newStringStack.pop());
//        newStringStack.show();
//



    }
}
