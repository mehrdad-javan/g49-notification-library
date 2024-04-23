package se.lexicon.dao;

import se.lexicon.model.Email;

import java.util.ArrayList;
import java.util.List;

public class EmailDaoImpl implements EmailDao {

    private  List<Email> emailList = new ArrayList<>();


    @Override
    public Email save(Email email) {
        return null;
    }

    @Override
    public void update(Email email) {

    }

    @Override
    public Email find(String id) {
        return null;
    }

    @Override
    public List<Email> findAll() {
        return null;
    }

    @Override
    public List<Email> findBySubject(String subject) {
        return null;
    }
}
