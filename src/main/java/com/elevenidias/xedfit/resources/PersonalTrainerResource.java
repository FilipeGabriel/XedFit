package com.elevenidias.xedfit.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elevenidias.xedfit.entities.PersonalTrainer;
import com.elevenidias.xedfit.services.PersonalTrainerService;

@RestController
@RequestMapping(value = "/personaltrainers")
public class PersonalTrainerResource {
	
	@Autowired
	private PersonalTrainerService personalTrainerService;
	
	@GetMapping
	public ResponseEntity<List<PersonalTrainer>> findAll(){
		List<PersonalTrainer> personalTrainers = personalTrainerService.findAll();
		return ResponseEntity.ok().body(personalTrainers);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<PersonalTrainer> findById(@PathVariable Long id){
		PersonalTrainer personalTrainer = personalTrainerService.findById(id);
		return ResponseEntity.ok().body(personalTrainer);
	}
	
}
