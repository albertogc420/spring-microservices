package com.geekshubs.patienthistory.app.services;

import com.geekshubs.patienthistory.domain.entities.PatientHistory;
import com.geekshubs.patienthistory.domain.exceptions.PatientHistoryException;

public interface PatientHistoryService {

    PatientHistory save(PatientHistory patientHistory) throws PatientHistoryException;

}
