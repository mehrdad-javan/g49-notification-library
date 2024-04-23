package se.lexicon;

import se.lexicon.dao.EmailDao;
import se.lexicon.dao.EmailDaoImpl;
import se.lexicon.exception.EmailException;
import se.lexicon.model.Email;
import se.lexicon.util.EmailSender;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /*EmailDao dao = EmailDaoImpl.getInstance();
        try {
            Email email1 = new Email("mehrdad.javan@lexicon.se", "test subject", "test message");
            Email savedEmail = dao.save(email1);
            dao.findAll().forEach(email -> System.out.println(email.summary()));
            System.out.println("-----------------------");
            EmailSender.sendEmail(savedEmail.getRecipient(), savedEmail.getSubject(), savedEmail.getContent());
            savedEmail.setStatus(true);
            dao.update(savedEmail);
            dao.findAll().forEach(email -> System.out.println(email.summary()));
        } catch (EmailException e) {
            System.out.println(e.getMessage());
        }*/

    }
}
