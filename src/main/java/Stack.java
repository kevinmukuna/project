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
    }

    public T pop() {
        StackElement<T> previousTop = top;
        if (isStackEmpty()){
            return errorMesage();
        }
        top = top.getnext();
        return previousTop.getvalue();
    }

    public T top() {

        if (isStackEmpty()){
            return errorMesage();
        }
        return top.getvalue();
    }

    public void init() {
        size = 0;
        top = null;
    }

    public void show() {
        StackElement<T> stackCOpy = top;
        while (stackCOpy.nextValue != null ){
            System.out.println(stackCOpy.valuePassed);
            stackCOpy = stackCOpy.nextValue;
        }
        System.out.println(stackCOpy.valuePassed);
    }

    // extra method
    public boolean isStackEmpty() {
        return size <= -1;
    }

    public T errorMesage (){
        return (T) "Sorry Stack is Empty";
    }

    public int getSize() {
        return size;
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
