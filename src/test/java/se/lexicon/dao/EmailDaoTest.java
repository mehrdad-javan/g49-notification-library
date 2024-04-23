package se.lexicon.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.lexicon.exception.DataNotFoundException;
import se.lexicon.model.Email;

import static org.junit.jupiter.api.Assertions.*;

public class EmailDaoTest {
    private EmailDaoImpl testObject;

    private Email savedEmail;

    @BeforeEach
    public void setup() {
        testObject = EmailDaoImpl.getInstance();

        Email email = new Email("recipient@example.com", "Test Subject", "Test Message");
        savedEmail = testObject.save(email);

        assertNotNull(savedEmail);

    }

    @Test
    @DisplayName("test save email")
    public void testSave() {
        // data
        Email email = new Email("recipient@example.se", "Test Subject", "Test Message");
        Email savedEmail = testObject.save(email);

        assertNotNull(savedEmail);

        Email foundEmail = testObject.find(savedEmail.getId());
        assertEquals(savedEmail, foundEmail);

    }

    @Test
    public void testFindExistingId() {
        Email foundEmail = testObject.find(savedEmail.getId());
        assertNotNull(foundEmail);
        assertEquals(savedEmail, foundEmail);
    }

    @Test
    public void testFindNonExistingId() {
        assertThrows(DataNotFoundException.class, ()-> testObject.find("non-existing-id") );
    }

    // add more tests as needed.


}
