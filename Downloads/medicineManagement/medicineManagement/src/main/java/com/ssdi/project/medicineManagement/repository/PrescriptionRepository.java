package com.ssdi.project.medicineManagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ssdi.project.medicineManagement.model.Prescription;

@Repository("prescriptionRepository")
public interface PrescriptionRepository extends CrudRepository<Prescription, Integer>{

}
