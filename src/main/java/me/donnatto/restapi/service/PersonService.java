package me.donnatto.restapi.service;

import me.donnatto.restapi.dao.PersonDao;
import me.donnatto.restapi.model.Person;

public class PersonService {
    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }
}
