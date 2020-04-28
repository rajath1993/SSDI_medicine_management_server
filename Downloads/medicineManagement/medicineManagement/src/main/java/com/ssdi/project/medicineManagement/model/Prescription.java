package com.ssdi.project.medicineManagement.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pharmacy_info")
public class Prescription {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pharmacy_id;
	private String pharmacy_name;
	private String location;
	private int miles;
	private String medication_name;
	
	
	public Prescription(int pharmacy_id, String pharmacy_name, String location, int miles, String medication_name) {
		super();
		this.pharmacy_id = pharmacy_id;
		this.pharmacy_name = pharmacy_name;
		this.location = location;
		this.miles = miles;
		this.medication_name = medication_name;
	}


	public int getPharmacy_id() {
		return pharmacy_id;
	}


	public void setPharmacy_id(int pharmacy_id) {
		this.pharmacy_id = pharmacy_id;
	}


	public String getPharmacy_name() {
		return pharmacy_name;
	}


	public void setPharmacy_name(String pharmacy_name) {
		this.pharmacy_name = pharmacy_name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getMiles() {
		return miles;
	}


	public void setMiles(int miles) {
		this.miles = miles;
	}


	public String getMedication_name() {
		return medication_name;
	}


	public void setMedication_name(String medication_name) {
		this.medication_name = medication_name;
	}


	@Override
	public String toString() {
		return "Prescription [pharmacy_id=" + pharmacy_id + ", pharmacy_name=" + pharmacy_name + ", location="
				+ location + ", miles=" + miles + ", medication_name=" + medication_name + "]";
	}
	
	
	
	
	

}
