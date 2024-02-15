package com.elevenidias.xedfit.entities;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_personal_trainer")
public class PersonalTrainer implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String identityCard;
	private String cip;
	private String name;
	private Instant registrationDate;
	private String address;
	private String telephone;
	private String email;
	private LocalDate birthDate;
	
	@OneToMany(mappedBy = "id.personalTrainer")
	private List<ScheduledClass> classes = new ArrayList<>();
	
	public PersonalTrainer() {
		
	}
	public PersonalTrainer(Long id, String identityCard, String cip, String name, Instant registrationDate,
			String address, String telephone, String email, LocalDate birthDate) {
		super();
		this.id = id;
		this.identityCard = identityCard;
		this.cip = cip;
		this.name = name;
		this.registrationDate = registrationDate;
		this.address = address;
		this.telephone = telephone;
		this.email = email;
		this.birthDate = birthDate;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	public String getCip() {
		return cip;
	}
	public void setCip(String cip) {
		this.cip = cip;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Instant getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Instant registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}	
	public List<ScheduledClass> getClasses() {
		return classes;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonalTrainer other = (PersonalTrainer) obj;
		return Objects.equals(id, other.id);
	}	
	
}
