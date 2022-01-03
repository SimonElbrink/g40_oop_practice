package se.lexicon.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BankAccountTest {

    private BankAccount testObject;

    @Before
    public void beforeEachTest(){
         testObject = new BankAccount(90000,1000, null);
    }


    @Test
    public void test_deposit_valid_amount() {
        System.out.println("Test 1");
        // Arrange - What do we need to perform the test?
        int amount = 1000;
        double expectedBalance = 2000;

        // Act - Perform the actual test.
        testObject.deposit(amount);

        // Assert - verify, with help of Junit.
        assertEquals(expectedBalance, testObject.getBalance(), 0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_deposit_should_throw_exception_when_negative(){
        System.out.println("Test 2");

        testObject.deposit(-6000);
    }

    @Test
    public void test_withdraw_successfully() {
        System.out.println("Test 3");

        double amount = 400;
        double expectedBalance= 600;

        testObject.withdraw(amount);

        assertEquals(expectedBalance, testObject.getBalance(), 0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_withdraw_should_throw_IllegalArgumentException_when_Negative(){
        System.out.println("Test 4");
        testObject.withdraw(-9000);
    }

    @Test
    public void test_withdraw_should_throw_IllegalArgumentException_when_Greater_then_Balance() {
        System.out.println("Test 5");
        assertThrows(IllegalArgumentException.class, ()-> testObject.withdraw(9000));
    }
}


