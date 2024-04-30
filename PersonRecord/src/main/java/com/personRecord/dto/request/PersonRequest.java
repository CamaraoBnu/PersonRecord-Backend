package com.personRecord.dto.request;

import com.personRecord.entities.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonRequest {

    private String cpf;

    private String name;

    private String phone;

    private String cep;

    private String number;

    private String comp;

    private String district;

    private String city;

    private String state;

    public Person toEntity() {
        return Person.builder()
                .cpf(this.cpf)
                .name(this.name)
                .phone(this.phone)
                .cep(this.cep)
                .number(this.number)
                .comp(this.comp)
                .district(this.district)
                .city(this.city)
                .state(this.state)
                .build();
    }
}
