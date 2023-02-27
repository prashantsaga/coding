package com.example.manytomany;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Skill {
	@Id
	private Integer id;
	private String skillName;
	private String skillDesc;// Description
	@ManyToMany(mappedBy = "skills")// mapped by skill into student
	@JsonIgnore
	private Set<Student> students = new HashSet<>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public String getSkillDesc() {
		return skillDesc;
	}
	public void setSkillDesc(String skillDesc) {
		this.skillDesc = skillDesc;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	

}

/*
  input-skill
  
   
 {
    "id":1,
    "skillName": "C",
    "skillDesc": "This is a C skill"
   }
   
   {
    "id":2,
    "skillName": "C++",
    "skillDesc": "This is a C++ skill"
   }
   
   {
    "id":3,
    "skillName": "Jave",
    "skillDesc": "This is a Java skill"
   }
   
   {
    "id":4,
    "skillName": "Paython",
    "skillDesc": "This is a Paython skill"
   }
   
  -------------------------------------------------
   {
     "id": 101,
     "firstName": "prashant",
     "lastName": "sagar",
     "skills":[{"id":1},{"id":2}]
    } 
    
     {
     "id": 101,
     "firstName": "shivam",
     "lastName": "soni",
     "skills":[{"id":1},{"id":,2}]
    } 
    
     {
     "id": 101,
     "firstName": "shivanand",
     "lastName": "sagar",
     "skills":[{"id":1},{"id",2}]
    } 
   
 */











