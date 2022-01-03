package se.lexicon;

import static org.junit.Assert.*;


import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @BeforeClass // Before we run any tests in this class.
    public static void beforeClass() throws Exception {
        System.out.println("Runs before the class is run. Clean Up");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Runs after the class is done. Clean Up");
    }

    @Before // Before each test is running.
    public void setUp() throws Exception {
        System.out.println("Runs before each test.");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Runs after each test.");
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        System.out.println("Test 1 running...");
    }

    @Test
    public void test2(){
        assertFalse(false);
        System.out.println("Test 2 running...");
    }
}
