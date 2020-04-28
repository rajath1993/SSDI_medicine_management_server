package com.ssdi.project.medicineManagement.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssdi.project.medicineManagement.model.Prescription;
import com.ssdi.project.medicineManagement.service.PrescriptionService;;


@RestController
public class ConfirmPrescriptionController {
	
	@Autowired
	private PrescriptionService prescriptionService; 
	
	@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
	@PostMapping(path="/confirmPrescription")
	public String confirmPresc(@RequestBody Prescription prescription) {
		prescriptionService.savePrescription(prescription);
		System.out.println(prescription.toString());
		return "Prescription Added";
	}

}
