package com.elevenidias.xedfit.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elevenidias.xedfit.entities.PersonalTrainer;
import com.elevenidias.xedfit.repositories.PersonalTrainerRepository;

@Service
public class PersonalTrainerService {
	
	@Autowired
	private PersonalTrainerRepository personalTrainerRepository;
	
	public List<PersonalTrainer> findAll(){
		return personalTrainerRepository.findAll();
	}
	
	public PersonalTrainer findById(Long id) {
		Optional<PersonalTrainer> personalTrainer = personalTrainerRepository.findById(id);
		return personalTrainer.get();
	}
	
}
