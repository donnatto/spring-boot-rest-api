package me.donnatto.restapi.api;

import me.donnatto.restapi.model.Person;
import me.donnatto.restapi.service.PersonService;

public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}
