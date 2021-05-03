package com.geekshubs.patienthistory.domain.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;



@Entity
@Data
@NoArgsConstructor
@Table(name = "patient_history")
public class PatientHistory {
    @Id
    @Column(name = "uuid", length = 16, unique = true, nullable = false)
    private String uuid = UUID.randomUUID().toString();

    @Column(name = "patient_name")
    private String patientName;

    @Column(name = "patient_last_name")
    private String patientLastName;

    @Column(name = "patient_uuid")
    private String patientUuid;

    @Column
    private String doctor;

    @Column
    private String specialty;

    public PatientHistory(String patientName, String patientLastName, String patientUuid, String doctor, String specialty) {
        this.patientName = patientName;
        this.patientLastName = patientLastName;
        this.patientUuid = patientUuid;
        this.doctor = doctor;
        this.specialty = specialty;
    }
}
