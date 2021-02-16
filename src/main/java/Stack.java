
import java.util.Arrays;

public class Stack {

    private final String[] stackArray;
    private final int stackSize;

    // Sets stack as empty

    private int topOfStack = -1;

    Stack(int size){

        stackSize = size;

        stackArray = new String[size];

        // Assigns the value of -1 to every value in the array
        // so I control what gets printed to screen

        Arrays.fill(stackArray, "-1");

    }

    public void push(String input){
        if(topOfStack+1 < stackSize){
            topOfStack++;
            stackArray[topOfStack] = input;
        }else System.out.println("Sorry But the Stack is Full");

        displayTheStack();
        System.out.println("PUSH " + input + " Was Added to the Stack\n");

    }

    public String pop(){
        if(topOfStack >= 0){
            displayTheStack();
            System.out.println("POP " + stackArray[topOfStack] + " Was Removed From the Stack\n");

            // Just like in memory an item isn't deleted, but instead is just not available
            stackArray[topOfStack] = "-1"; // Assigns -1 so the value won't appear
            return stackArray[topOfStack--];
        }else{
            displayTheStack();
            System.out.println("Sorry But the Stack is Empty");
            return "-1";
        }
    }

    public String peek(){
        displayTheStack();
        System.out.println("PEEK " + stackArray[topOfStack] + " Is at the Top of the Stack\n");
        return stackArray[topOfStack];
    }

    public void pushMany(String multipleValues){
        String[] tempString = multipleValues.split(" ");
        for (String s : tempString) {
            push(s);
        }
    }

    public void popAll(){
        for(int i = topOfStack; i >= 0; i--){
            pop();
        }
    }

    public void popDisplayAll(){
        StringBuilder theReverse = new StringBuilder();
        for(int i = topOfStack; i >= 0; i--){
            theReverse.append(stackArray[i]);
        }
        System.out.println("The Reverse: " + theReverse);
        popAll();
    }

    public void displayTheStack(){
        for(int n = 0; n < 61; n++)System.out.print("-");
        System.out.println();
        for(int n = 0; n < stackSize; n++){
            System.out.format("| %2s "+ " ", n);
        }

        System.out.println("|");

        for(int n = 0; n < 61; n++)System.out.print("-");

        System.out.println();

        for(int n = 0; n < stackSize; n++){
            if(stackArray[n].equals("-1")) System.out.print("|     ");
            else System.out.printf("| %2s "+ " ", stackArray[n]);
        }

        System.out.println("|");

        for(int n = 0; n < 61; n++)System.out.print("-");

        System.out.println();

    }
}