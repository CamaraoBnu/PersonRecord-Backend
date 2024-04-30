package com.personRecord.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPerson is a Querydsl query type for Person
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPerson extends EntityPathBase<Person> {

    private static final long serialVersionUID = -969869913L;

    public static final QPerson person = new QPerson("person");

    public final StringPath cep = createString("cep");

    public final StringPath city = createString("city");

    public final StringPath comp = createString("comp");

    public final StringPath cpf = createString("cpf");

    public final StringPath district = createString("district");

    public final StringPath name = createString("name");

    public final StringPath number = createString("number");

    public final StringPath phone = createString("phone");

    public final StringPath state = createString("state");

    public QPerson(String variable) {
        super(Person.class, forVariable(variable));
    }

    public QPerson(Path<? extends Person> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPerson(PathMetadata metadata) {
        super(Person.class, metadata);
    }

}

