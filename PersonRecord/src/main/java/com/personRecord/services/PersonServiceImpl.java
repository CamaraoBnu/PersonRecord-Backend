package com.personRecord.services;

import com.personRecord.dto.request.PersonRequest;
import com.personRecord.dto.response.PersonResponse;
import com.personRecord.entities.Person;
import com.personRecord.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public PersonResponse create(PersonRequest request) {

        Person person = request.toEntity();
        Person createdPerson = this.personRepository.saveWithTransaction(person);
        return PersonResponse.fromEntity(createdPerson);
    }

    @Override
    public PersonResponse updatePersonByCPF(PersonRequest request, String cpf) {
        Person person = request.toEntity();
        Person updatedPerson = this.personRepository.updatePersonByCPF(person, cpf);
        return PersonResponse.fromEntity(updatedPerson);
    }

    @Override
    public PersonResponse deletePersonByCPF(PersonRequest request, String cpf) {
        Person person = request.toEntity();
        Person deletedPerson = this.personRepository.deletePersonByCPF(person, cpf);
        return PersonResponse.fromEntity(deletedPerson);
    }

    @Override
    public Person getPersonByCPF(String cpf) {
        return this.personRepository.getPersonByCPF(cpf);
    }

    @Override
    public List<Person> getAllPerson() {
        return this.personRepository.getAllPerson();
    }

}
