package com.elevenidias.xedfit.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.elevenidias.xedfit.entities.PersonalTrainer;
import com.elevenidias.xedfit.entities.Student;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ScheduledClassPK implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "personal_trainer_id")
	private PersonalTrainer personalTrainer;

	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public PersonalTrainer getPersonalTrainer() {
		return personalTrainer;
	}
	public void setPersonalTrainer(PersonalTrainer personalTrainer) {
		this.personalTrainer = personalTrainer;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(personalTrainer, student);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScheduledClassPK other = (ScheduledClassPK) obj;
		return Objects.equals(personalTrainer, other.personalTrainer) && Objects.equals(student, other.student);
	}
}
