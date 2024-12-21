package com.company.service;

import com.company.model.Person;
import com.company.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.NoSuchElementException;


@Service
public class PersonService {

    @Autowired //works like @Inject annotation
    private PersonRepository personRepository;

    //method to retrieve all person records
    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }

    //method to get a person record by its id
    public Person getPersonById(@PathVariable("id") int id){
        return personRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    //method to save new person record in the database
    public int saveNewPerson(Person person){
       return personRepository.save(person).getId();
    }

    //method to update an existing record
    public Person updatePerson(Person person, int id){

        Person entity = personRepository.findById(id).get(); //not a realistic use

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAge(person.getAge());

        return personRepository.save(entity);
    }

    //method to delete a person record by it
    public void deletePerson(int id){
        personRepository.deleteById(id);
    }
}
