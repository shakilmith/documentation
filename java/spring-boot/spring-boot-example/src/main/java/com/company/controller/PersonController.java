package com.company.controller;

import com.company.model.Person;
import com.company.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PersonController {

    @Autowired
    private PersonService personService;

    //getMapping for retrieving all person records
    @GetMapping("/api/persons")
    public Iterable<Person> getAll(){
        return personService.getAllPerson();
    }

    //getMapping for retrieving person by id (single person details)
    @GetMapping("/api/persons/{id}")
    public Person getOne(@PathVariable("id") int id){
        return personService.getPersonById(id);
    }

    //postMapping for saving new person records into the database
    @PostMapping("/api/persons")
    public int savePerson(@RequestBody Person person){
        return personService.saveNewPerson(person); //it returns int (the id of the saved persons)
    }

    //putMapping for updating existing records by id
    @PutMapping("/api/persons/{id}")
    public Person person(@RequestBody Person person, @PathVariable("id") int id){

        Person entity = personService.updatePerson(person, id);
        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAge(person.getAge());

        return entity;
    }

    //deleteMapping for deleting specific person record by its id
    @DeleteMapping("/api/persons/{id}")
    public void deletePerson(@PathVariable("id") int id){
        personService.deletePerson(id);
    }
}
