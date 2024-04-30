package com.personRecord.dto.response;


import com.personRecord.entities.Person;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonResponse {

    private String cpf;

    private String name;

    private String phone;

    private String cep;

    private String number;

    private String comp;

    private String district;

    private String city;

    private String state;

    public static PersonResponse fromEntity(Person person) {

        return PersonResponse.builder()
                .cpf(person.getCpf())
                .name(person.getName())
                .phone(person.getPhone())
                .cep(person.getCep())
                .number(person.getNumber())
                .comp(person.getComp())
                .district(person.getDistrict())
                .city(person.getCity())
                .state(person.getState())
                .build();
    }

}
