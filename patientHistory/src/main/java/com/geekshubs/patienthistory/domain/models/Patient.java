package com.geekshubs.patienthistory.domain.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;


@Data
@NoArgsConstructor
public class Patient {

    private String uuid;
    private String name;
    private String lastname;

    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate birthdate;

    private Date datecreated;

    public Patient(String name, String lastname, LocalDate birthdate) {
        this.name = name;
        this.lastname = lastname;
        this.birthdate = birthdate;
    }


}
