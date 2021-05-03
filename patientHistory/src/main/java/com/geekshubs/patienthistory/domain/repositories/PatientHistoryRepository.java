package com.geekshubs.patienthistory.domain.repositories;


import com.geekshubs.patienthistory.domain.entities.PatientHistory;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PatientHistoryRepository extends JpaRepository<PatientHistory, String> {

}
