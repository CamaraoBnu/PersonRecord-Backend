package com.personRecord.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity(name = "person")
@Table(name = "person")
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Person {

    @Id
    @Column(name = "nr_cpf", nullable = false, unique = true)
    private String cpf;

    @Column(name = "ds_name", nullable = false)
    private String name;

    @Column(name = "nr_phone", nullable = false)
    private String phone;

    @Column(name = "nr_cep", nullable = false)
    private String cep;

    @Column(name = "ds_street", nullable = false)
    private String street;

    @Column(name = "nr_number", nullable = false)
    private String number;

    @Column(name = "ds_comp", nullable = true)
    private String comp;

    @Column(name = "ds_district", nullable = false)
    private String district;

    @Column(name = "ds_city", nullable = false)
    private String city;

    @Column(name = "ds_state", nullable = false)
    private String state;

    @Builder
    public Person(String cpf, String name, String phone, String cep, String street, String number, String comp, String district, String city, String state) {
        this.cpf = cpf;
        this.name = name;
        this.phone = phone;
        this.cep = cep;
        this.street = street;
        this.number = number;
        this.comp = comp;
        this.district = district;
        this.city = city;
        this.state = state;
    }

}
