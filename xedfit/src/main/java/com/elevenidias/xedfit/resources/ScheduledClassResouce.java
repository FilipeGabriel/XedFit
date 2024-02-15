package com.elevenidias.xedfit.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elevenidias.xedfit.entities.ScheduledClass;
import com.elevenidias.xedfit.entities.pk.ScheduledClassPK;
import com.elevenidias.xedfit.services.ScheduledClassService;

@RestController
@RequestMapping(value = "/scheduledclasses")
public class ScheduledClassResouce {
	
	@Autowired
	private ScheduledClassService scheduledClassService;
	
	@GetMapping
	public ResponseEntity<List<ScheduledClass>> findAll(){
		List<ScheduledClass> scheduledClasses = scheduledClassService.findAll();
		return ResponseEntity.ok().body(scheduledClasses);
	}
	@GetMapping
	public ResponseEntity<ScheduledClass> findById(@PathVariable ScheduledClassPK id){
		ScheduledClass scheduledClass = scheduledClassService.findById(id);
		return ResponseEntity.ok().body(scheduledClass);
	}
	
}
