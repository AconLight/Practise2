package myProject;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static myProject.App.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        Boolean isUnder18Var;
        isUnder18Var = isUnderAge(19, true);
        assertTrue(isUnder18Var == false);
        isUnder18Var = isUnderAge(17, true);
        assertTrue(isUnder18Var == true);
        isUnder18Var = isUnderAge(30, false);
        assertTrue(isUnder18Var == false);
        isUnder18Var = isUnderAge(19, false);
        assertTrue(isUnder18Var == true);
    }

    public void testfunction() {
        int result;
        for (int x = 0; x < 10; x++) {
            result = function(x);
            assertTrue(result == x*2);
        }
    }
    public void testsum () {
        int result;
        result = sum(74,36);
        assertTrue(result == 110);


    }
    public void testdiv () {
        int result;
        result = div(50,3);
        assertTrue(result == 16);
    }
}

