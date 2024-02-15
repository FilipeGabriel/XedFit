package com.elevenidias.xedfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elevenidias.xedfit.entities.ScheduledClass;
import com.elevenidias.xedfit.entities.pk.ScheduledClassPK;

public interface ScheduledClassRepository extends JpaRepository<ScheduledClass, ScheduledClassPK>{
	
}
