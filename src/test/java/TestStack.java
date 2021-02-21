import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class TestStack {
    Stack<String> moduleCodes = new Stack<>();

//    @Test
//    @DisplayName("push to the top of stack testing")
//    void pushToTheTopOfStackTesting() {
//        moduleCodes.push("CS3305 ");
//        moduleCodes.push("CS3306 ");
//        moduleCodes.push("CS3506 ");
//        moduleCodes.push("CS3506 ");
//        moduleCodes.push("CS3514 ");
//        moduleCodes.push("CS3516 ");
//        moduleCodes.push("CS3519 ");
//        moduleCodes.push("CS1117 ");
//
//        assertAll(
//
//                ()->assertTrue()
//        );
//    }

    @Test
    @DisplayName("testing the init method")
    void testingTheInitMethod() {
        moduleCodes.init();
        assertTrue(moduleCodes.isStackEmpty());
    }


}
