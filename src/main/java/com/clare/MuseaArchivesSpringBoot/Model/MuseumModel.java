package com.clare.MuseaArchivesSpringBoot.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "Museums")
@EntityListeners(AuditingEntityListener.class)
public class MuseumModel implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Museum_ID;
	
	@NotBlank
	private String Name;
	
	@NotBlank
	private String Address_Line_1;
	

	private String Address_Line_2;
	

	private String City;
	
	@NotBlank
	private String PostCode;
	

	private String Contact_Email;
	

	private String Contact_Number;
	

	private String Admission;
	

	private String Website;
	

	private String Category;


	public Long getMuseum_id() {
		return Museum_ID;
	}




	public String getName() {
		return Name;
	}


	public void setName(String vName) {
		this.Name = vName;
	}


	public String getAddress_Line_1() {
		return Address_Line_1;
	}


	public void setAddress_Line_1(String vAddress_Line_1) {
		this.Address_Line_1 = vAddress_Line_1;
	}


	public String getAddress_Line_2() {
		return Address_Line_2;
	}


	public void setAddress_Line_2(String vAddress_Line_2) {
		this.Address_Line_2 = vAddress_Line_2;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String vCity) {
		this.City = vCity;
	}


	public String getPostCode() {
		return PostCode;
	}


	public void setPostCode(String vPostCode) {
		this.PostCode = vPostCode;
	}


	public String getContact_Email() {
		return Contact_Email;
	}


	public void setContact_Email(String vContact_Email) {
		this.Contact_Email = vContact_Email;
	}


	public String getContact_Number() {
		return Contact_Number;
	}


	public void setContact_Number(String vContact_Number) {
		this.Contact_Number = vContact_Number;
	}


	public String getAdmission() {
		return Admission;
	}


	public void setAdmission(String vAdmission) {
		this.Admission = vAdmission;
	}


	public String getWebsite() {
		return Website;
	}


	public void setWebsite(String vWebsite) {
		this.Website = vWebsite;
	}


	public String getCategory() {
		return Category;
	}


	public void setCategory(String vCategory) {
		this.Category = vCategory;
	}
	
	

	
}
