package com.ssdi.project.medicineManagement.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ssdi.project.medicineManagement.model.Prescription;
import com.ssdi.project.medicineManagement.repository.PrescriptionRepository;


@Service
@Transactional
public class PrescriptionService {
	
	private final PrescriptionRepository prescriptionRepository;
	
	public PrescriptionService(PrescriptionRepository prescriptionRepository) {
		this.prescriptionRepository = prescriptionRepository;
	}
	
	public void savePrescription(Prescription prescription) {
		prescriptionRepository.save(prescription);
	}
	
//	public Prescription findByName(String pharmacyName) {
//		return prescriptionRepository.findByName(pharmacyName);
//	}

}
