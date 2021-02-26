package simulator;
/**
 * This is a TestRunner class that calls in the TestStack class, which then runs all the each unit test
 * @author Kevin Mukuna <br> This is part of C3306 assigment 1 by Marc Van Dongen 2020/2021 this modules and assignement
 * was designed to get us familiar with some of the tools and version control used in work placement fields *
 */
public class TestRunner {
    /**
     * @param args no argument is passed the following class is only used for calling the test class which than
     *             executes each unit test
     */
    public static void main(String[] args) {
        TestStack test = new TestStack();
        System.out.println("---------------Testing each unit using junit -------------");
        test.main();
    }
}
