package com.example.onetomany;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Person {
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL)// person is a attribute in the mobile number class
	private Set<MobileNumber> mobileNumbers = new HashSet<>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setMobileNumbers(Set<MobileNumber> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}
	
	public Set<MobileNumber> getMobileNumbers() {
		return mobileNumbers;
	}
	

}

/*
     {
        "id":101,
        "firstName": "abc",
        "lastName": "xyz"
     }
     
 ------------------------------    
     {
        "id":101,
        "firstName": "abc",
        "lastName": "xyz",
        "mobileNumbers": [
            {
         "id": 501,
	     "mobileNumber": 8076911043,
	     "serviceProvider": "jio",
	     "person":{
	     "id": 101
	      }
         },
         {
         "id": 502,
	     "mobileNumber": 8076911044,
	     "serviceProvider": "airtel",
	     "person":{
	     "id": 101
	         }
          }
         
        ]
     }
        
 */








