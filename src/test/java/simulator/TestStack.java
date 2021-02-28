 package simulator;

 import org.junit.jupiter.api.Test;
 import org.junit.jupiter.api.DisplayName;
 import simulator.Stack;

 import static org.junit.jupiter.api.Assertions.*;

 /**
 * @author kevinmukuna
 * the following is test class implmented using Junit and maven
 * this is part of CS3306 assigment 1 by Marc Van Dongen
 * this modules and assignement was designed to get us familiar with some of the tools and version control used
 * in work placement fields
 * This is test class implemented using the TDD approach, where i write the minimum code required for the test case
 * and then iterate over it till it meets the perfect passing requirement.
 * {@link #testingForPushMethod()} : this method is used for testing entries being pushed to the top of the stack,
 * it returns true if the number of items on the stack eqauls the size of the stack
 * @see #testingForTopItemOnTopOfTheStack() : this method returns true of the last entry that was pushed is equal
 * to the item on the top of the stack
 * @see #testingForThePOPFunctionality() : this method returns true if the item previous to the item on top is
 * returned as top when the pop method is called.
 * @see #testingTheInitMethod() this method is used to initiliase the stack
 * @see #getTheCurrentSizeOfTheStack() returns the size of the stack
 * @see #testingForTheShowMethod() this method returns everything that was pushed unto the stack
 * @see #testingToEnsureThatErrorMessageWhenACallDoesNotMeetRequirement() this method returns error message  if an
 * operation is called on the methods when it is empty
 * @see #testingForTopAndPopWhenTheStackHasBeenEmptied() this method true if the message returned is as expected
 */
 public class TestStack {
     /**
      * please note that i am calling the @see #testingForTheInit method to clear up the stack. this only because i am
      * reusing the data in push method. this is so that i dont have to re-write the same code over and over for testing
      */
     public void main(){
         testingTheInitMethod();
         getTheCurrentSizeOfTheStack();
         testingForPushMethod();
         testingForTopItemOnTopOfTheStack();
         testingForThePOPFunctionality();
         testingForTheShowMethod();
         testingForTopAndPopWhenTheStackHasBeenEmptied();
         testingToEnsureThatErrorMessageWhenACallDoesNotMeetRequirement();
     }
    Stack<String> moduleCodes = new Stack<>();

    @Test
    @DisplayName("testing the init method")
    void testingTheInitMethod() {
        moduleCodes.init();
        assertTrue(moduleCodes.isEmpty());
    }

    @Test
    @DisplayName("get the current size of the stack")
    void getTheCurrentSizeOfTheStack() {
        assertEquals(0, moduleCodes.getSize());
    }

    /**
     * this method is used for testing entries being pushed to the top of the stack,
     * it returns true if the number of items on the stack eqauls the size of the stack
     */
    @Test
    @DisplayName("testing for push method")
    void testingForPushMethod() {
        moduleCodes.push("CS3305");
        moduleCodes.push("CS3306");
        moduleCodes.push("CS3506");
        moduleCodes.push("CS3506");
        moduleCodes.push("CS3514");
        moduleCodes.push("CS3516");
        moduleCodes.push("CS3519");
        moduleCodes.push("CS1117");
        assertEquals(7+1,moduleCodes.getSize());
    }

    @Test
    @DisplayName("testing for top item on top of the stack")
    void testingForTopItemOnTopOfTheStack() {
        testingTheInitMethod();
        testingForPushMethod();
        System.out.println();
        assertEquals("CS1117", moduleCodes.peek());
    }

    @Test
    @DisplayName("testing for the POP functionality")
    void testingForThePOPFunctionality() {
        testingTheInitMethod();
        testingForPushMethod();
        moduleCodes.pop();
        assertEquals("CS3519", moduleCodes.peek());
    }

    @Test
    @DisplayName("testing for the show method")
    void testingForTheShowMethod() {
        testingTheInitMethod();
        testingForPushMethod();
        moduleCodes.show();
    }

    @Test
    @DisplayName("testing to ensure that error message when a call does not meet requirement")
    void testingToEnsureThatErrorMessageWhenACallDoesNotMeetRequirement() {
//        testingTheInitMethod();
        moduleCodes.pop();
        moduleCodes.peek();
    }

    @Test
    @DisplayName("testing for top and pop when the stack has been emptied")
    void testingForTopAndPopWhenTheStackHasBeenEmptied() {
        testingTheInitMethod();
        testingForPushMethod();
        while(!moduleCodes.isEmpty()){
            moduleCodes.pop();
        }
        assertAll(
                ()-> assertEquals("Sorry Stack is Empty",moduleCodes.peek()),
                ()-> assertEquals("Sorry Stack is Empty",moduleCodes.pop())
        );
    }
 }
