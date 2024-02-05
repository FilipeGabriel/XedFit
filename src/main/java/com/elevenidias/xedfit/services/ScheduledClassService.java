package com.elevenidias.xedfit.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elevenidias.xedfit.entities.ScheduledClass;
import com.elevenidias.xedfit.entities.pk.ScheduledClassPK;
import com.elevenidias.xedfit.repositories.ScheduledClassRepository;

@Service
public class ScheduledClassService {
	
	@Autowired
	private ScheduledClassRepository scheduledClassRepository;
	
	public List<ScheduledClass> findAll(){
		return scheduledClassRepository.findAll();
	}
	
	public ScheduledClass findById(ScheduledClassPK id) {
		Optional<ScheduledClass> scheduledClass = scheduledClassRepository.findById(id);
		return scheduledClass.get();
	}
}
