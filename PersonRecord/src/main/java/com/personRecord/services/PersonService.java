package com.personRecord.services;

import com.personRecord.dto.request.PersonRequest;
import com.personRecord.dto.response.PersonResponse;
import com.personRecord.entities.Person;

import java.util.List;

public interface PersonService {

    PersonResponse create(PersonRequest personRequest);

    PersonResponse updatePersonByCPF(PersonRequest personRequest, String cpf);

    Person deletePersonByCPF(String cpf);

    Person getPersonByCPF(String cpf);

    List<Person> getAllPerson();

}
