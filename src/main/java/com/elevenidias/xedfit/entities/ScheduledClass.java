package com.elevenidias.xedfit.entities;

import java.time.LocalDateTime;

import com.elevenidias.xedfit.entities.pk.ScheduledClassPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_scheduled_class")
public class ScheduledClass {
	
	@EmbeddedId
	private ScheduledClassPK id;
	private LocalDateTime scheduledTime;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private Integer duration;
	
	public ScheduledClass() {
		
	}
	public ScheduledClass(Student student, PersonalTrainer personalTrainer, LocalDateTime scheduledTime, LocalDateTime startTime,
			LocalDateTime endTime, Integer duration) {
		super();
		id.setStudent(student);
		id.setPersonalTrainer(personalTrainer);
		this.scheduledTime = scheduledTime;
		this.startTime = startTime;
		this.endTime = endTime;
		this.duration = duration;
	}
	
	public Student getStudent() {
		return id.getStudent();
	}
	public void setStudent(Student student) {
		id.setStudent(student);
	}
	public PersonalTrainer getPersonalTrainer() {
		return id.getPersonalTrainer();
	}
	public void setPersonalTrainer(PersonalTrainer personalTrainer) {
		id.setPersonalTrainer(personalTrainer);
	}
	public LocalDateTime getScheduledTime() {
		return scheduledTime;
	}
	public void setScheduledTime(LocalDateTime scheduledTime) {
		this.scheduledTime = scheduledTime;
	}
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}	
	
}
