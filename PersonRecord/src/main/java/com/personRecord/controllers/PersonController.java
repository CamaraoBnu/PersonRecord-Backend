package com.personRecord.controllers;

import com.personRecord.dto.request.PersonRequest;
import com.personRecord.dto.response.PersonResponse;
import com.personRecord.entities.Person;
import com.personRecord.services.PersonService;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("person")
@CrossOrigin

public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping(path = "/create", produces = "application/json", consumes = "application/json")
    public PersonResponse create(@Valid @RequestBody PersonRequest body) {
        return this.personService.create(body);
    }

    @PutMapping(path = "/update/{cpf}", produces = "application/json", consumes = "application/json")
    public void updatePersonByCPF(@RequestBody PersonRequest request, @PathVariable String cpf) {
        this.personService.updatePersonByCPF(request, cpf);
    }

    @DeleteMapping(path = "/delete/{cpf}", produces = "application/json")
    public void deletePersonByCPF(@RequestBody PersonRequest request, @PathVariable String cpf) {
        this.personService.deletePersonByCPF(request, cpf);
    }

    @GetMapping(path = "/get/{cpf}", produces = "application/json")
    public Person getPersonByCPF(@RequestBody @PathVariable String cpf) {
        return this.personService.getPersonByCPF(cpf);
    }

    @GetMapping(path = "/getAll", produces = "application/json")
    public List<Person> getAllPerson() {
       return this.personService.getAllPerson();
    }
}
