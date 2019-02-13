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
	
	
	private String postcode;
	

	private String Contact_Email;
	

	private String Contact_Number;
	

	private String Admission;
	

	private String Website;
	

	private String Category;
	
	

	public MuseumModel() {
	}


	public MuseumModel( String vName, String vAddress_Line_1, String vAddress_Line_2, 
			String vCity, String vPostcode,
			String vContact_Email, String vContact_Number, 
			String vAdmission, String vWebsite, String vCategory) {
		   
		super();

		this.Name = vName;
		this.Address_Line_1 = vAddress_Line_1;
		this.Address_Line_2 = vAddress_Line_2;
		this.City = vCity;
		this.postcode = vPostcode;
		this.Contact_Email = vContact_Email;
		this.Contact_Number = vContact_Number;
		this.Admission = vAdmission;
		this.Website = vWebsite;
		this.Category = vCategory;
		
	}

	
	
	
	public Long getMuseum_ID() {
		return Museum_ID;
	}



	public String getName() {
		return Name;
	}


	public void setName(String vName) {
		Name = vName;
	}


	public String getAddress_Line_1() {
		return Address_Line_1;
	}


	public void setAddress_Line_1(String address_Line_1) {
		Address_Line_1 = address_Line_1;
	}


	public String getAddress_Line_2() {
		return Address_Line_2;
	}


	public void setAddress_Line_2(String address_Line_2) {
		Address_Line_2 = address_Line_2;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	public String getPostcode() {
		return postcode;
	}


	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}


	public String getContact_Email() {
		return Contact_Email;
	}


	public void setContact_Email(String contact_Email) {
		Contact_Email = contact_Email;
	}


	public String getContact_Number() {
		return Contact_Number;
	}


	public void setContact_Number(String contact_Number) {
		Contact_Number = contact_Number;
	}


	public String getAdmission() {
		return Admission;
	}


	public void setAdmission(String admission) {
		Admission = admission;
	}


	public String getWebsite() {
		return Website;
	}


	public void setWebsite(String website) {
		Website = website;
	}


	public String getCategory() {
		return Category;
	}


	public void setCategory(String category) {
		Category = category;
	}


	
	



	
}
