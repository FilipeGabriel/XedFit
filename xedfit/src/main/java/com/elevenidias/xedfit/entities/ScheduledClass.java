package com.elevenidias.xedfit.entities;

import java.time.Duration;
import java.time.LocalDateTime;

import com.elevenidias.xedfit.entities.pk.ScheduledClassPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_scheduled_class")
public class ScheduledClass {
	
	@EmbeddedId
	private ScheduledClassPK id = new ScheduledClassPK();
	private LocalDateTime scheduledTime;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private Long duration;
	
	public ScheduledClass() {
		
	}
	public ScheduledClass(Student student, PersonalTrainer personalTrainer, LocalDateTime scheduledTime, LocalDateTime startTime,
			LocalDateTime endTime) {
		super();
		id.setStudent(student);
		id.setPersonalTrainer(personalTrainer);
		this.scheduledTime = scheduledTime;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public Student getStudent() {
		return id.getStudent();
	}
	public void setStudent(Student student) {
		id.setStudent(student);
	}
	@JsonIgnore
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
	public Long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	
	public Long duration() {
		Duration duration = Duration.between(getStartTime(), getEndTime());
		return duration.toHours();
	}
	
}
