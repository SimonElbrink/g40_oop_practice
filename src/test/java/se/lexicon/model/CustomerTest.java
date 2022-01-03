package se.lexicon.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void test_create_Customer_successfully() {

        Customer testObject = new Customer(
                "Test",
                "Testsson",
                "123456",
                "test.testsson@test.com"
        );

        assertEquals("Test", testObject.getFirstName());
        assertEquals("Testsson",testObject.getLastName());
        assertEquals("123456", testObject.getPhoneNumber());
        assertTrue(testObject.getCustomerSummary().contains("test.testsson@test.com"));


    }
}