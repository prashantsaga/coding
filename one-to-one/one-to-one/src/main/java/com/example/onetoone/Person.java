package com.example.onetoone;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL)// foreign key through one to one, bi-directional
	private Address address; // child will sending along with parent
	
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	

}

/*
    {
       "id" : 1,
	 "firstName" : "abc",
	  "lastName" : "xyz",
	  " age" : 22
	 }
	 
	 {
       "id" : 1,
	 "firstName" : "abc",
	  "lastName" : "xyz",
	  " age" : 22,
	  "address":{
	  "id":101,
	  "houseNo":"123/M",
	  "streetName": "BTM",
	  "person":{
	  "id": 1
	 }
	 }
	 }
 */
// cascade- to provide chling along with parent