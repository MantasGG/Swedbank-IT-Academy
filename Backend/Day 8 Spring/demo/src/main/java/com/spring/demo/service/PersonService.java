package com.spring.demo.service;

import com.spring.demo.model.api.CreatePersonRequest;
import com.spring.demo.model.domain.Person;
import com.spring.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    //private final BarFormatter barFormatter;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> fetchPersons(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            return personRepository.findAllByLastNameAndFirstName(lastName, firstName);
        } else if (firstName != null) {
            return personRepository.findAllByFirstName(firstName);
        } else if (lastName != null) {
            personRepository.findAllByLastName(lastName);
        }
        return personRepository.findAll();

        //return personRepository.findFirstByLastNameAndFirstName("Testauskas1", "Testas1");

    }

    public Optional<Person> fetchPerson(Long id) {
        return this.personRepository.findById(id);
    }

    public Person createPerson(CreatePersonRequest request) {
        Person person = Person.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .middleName(request.getMiddleName())
                .email(request.getEmail())
                .phone(request.getPhone())
                .build();
        return personRepository.save(person);
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }
}
















