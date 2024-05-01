package com.personRecord.repositories;

import com.personRecord.entities.Person;
import com.personRecord.entities.QPerson;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public Person saveWithTransaction(Person person) {
        this.entityManager.persist(person);
        this.entityManager.merge(person);
        return person;
    }

    @Transactional
    @CacheEvict(allEntries = true)
    public Person updatePersonByCPF(Person person, String cpf) {
        QPerson qPerson = QPerson.person;
        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);
        queryFactory.update(qPerson)
                .set(qPerson.cpf, person.getCpf())
                .set(qPerson.cep, person.getCep())
                .set(qPerson.name, person.getName())
                .set(qPerson.phone, person.getPhone())
                .set(qPerson.number, person.getNumber())
                .set(qPerson.comp, person.getComp())
                .set(qPerson.district, person.getDistrict())
                .set(qPerson.city, person.getCity())
                .set(qPerson.state, person.getState())
                .where(qPerson.cpf.eq(person.getCpf()))
                .execute();

        return person;

    }

    @Transactional
    public Person deletePersonByCPF(String cpf) {
       JPAQueryFactory  queryFactory = new JPAQueryFactory(entityManager);
       Person person = getPersonByCPF(cpf);
       QPerson qPerson = QPerson.person;
       queryFactory.delete(qPerson)
               .where(qPerson.cpf.eq(cpf))
               .execute();
        return person;
    }

    public Person getPersonByCPF(String cpf) {
        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);
        QPerson qPerson = QPerson.person;
        return queryFactory
                .selectFrom(qPerson)
                .where(qPerson.cpf.eq(cpf))
                .fetchOne();
    }

    public List<Person> getAllPerson() {
        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);
        QPerson qPerson = QPerson.person;
        return queryFactory
                .selectFrom(qPerson)
                .fetch();
    }

}
