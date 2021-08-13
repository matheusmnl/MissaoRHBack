package com.desafiomissaorh.missaorh.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "users")
	public class User implements Serializable {
	
	    private static final long serialVersionUID = 1L;

	    @Id
	    @Column(name="idUser")
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    
	    @Lob
	    @Column(name="picture")
	    private Byte[] picture;

	    @Column(name = "name")
	    private String name;

	    @Column(name = "code")
	    private String code;

	    @JsonFormat(pattern = "dd/MM/yyyy")
	    @Column(name = "birthdate")
	    private Date birthdate;
	    

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public Byte[] getPicture() {
			return picture;
		}

		public void setPicture(Byte[] picture) {
			this.picture = picture;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public Date getBirthdate() {
			return birthdate;
		}

		public void setBirthdate(Date birthdate) {
			this.birthdate = birthdate;
		}









	



}
