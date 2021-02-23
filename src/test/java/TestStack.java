import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class TestStack {
    Stack<String> moduleCodes = new Stack<>();

    @Test
    @DisplayName("testing the init method")
    void testingTheInitMethod() {
        moduleCodes.init();
        assertTrue(moduleCodes.isStackEmpty());
    }
    @Test
    @DisplayName("get the current size of the stack")
    void getTheCurrentSizeOfTheStack() {
        assertEquals(0, moduleCodes.getSize());
    }

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
        assertEquals(8,moduleCodes.getSize());
    }

    @Test
    @DisplayName("testing for top item on top of the stack")
    void testingForTopItemOnTopOfTheStack() {
        testingForPushMethod();
        System.out.println();
        assertEquals("CS1117", moduleCodes.top());
    }

    @Test
    @DisplayName("testing for the POP functionality")
    void testingForThePOPFunctionality() {
        testingForPushMethod();
        moduleCodes.pop();
        assertEquals("CS3519", moduleCodes.top());
    }
    
    @Test
    @DisplayName("testing for the show method")
    void testingForTheShowMethod() {
        testingForPushMethod();
        moduleCodes.show();
    }
    
    @Test
    @DisplayName("testing to ensure that error message when a call does not meet requirement")
    void testingToEnsureThatErrorMessageWhenACallDoesNotMeetRequirement() {
       moduleCodes.pop();
       moduleCodes.top();
    }
    
//    @Test
//    @DisplayName("testing to pop when the stack has been emptied ")
//    void testingToPopWhenTheStackHasBeenEmptied() {
//        testingForPushMethod();
//        while(moduleCodes.top != null){
//            moduleCodes.pop();
//        }
//        assertEquals("Sorry Stack is Empty",moduleCodes.pop());
//    }
    @Test
    @DisplayName("testing for top and pop when the stack has been emptied")
    void testingForTopAndPopWhenTheStackHasBeenEmptied() {
        fail("not implemented");
    }
}
