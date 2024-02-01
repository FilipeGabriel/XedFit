package com.elevenidias.xedfit.config;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.elevenidias.xedfit.entities.Student;
import com.elevenidias.xedfit.repositories.StudentRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Student s1 = new Student(null,"112.019.554-32", "Filipe Gabriel", "Sucupira", "(81)98494-6724", "filipe@gmail.com",LocalDate.parse("1997-04-18"), 1.81, 65.5f);
		Student s2 = new Student(null,"725.019.554-32", "Mariana Maria", "Sucupira", "(81)99353-6724", "mariana@gmail.com",LocalDate.parse("1997-02-24"), 1.71, 60.5f);
		Student s3 = new Student(null,"843.019.554-32", "Alice Maria", "Sucupira", "(81)98464-6724", "alice@gmail.com",LocalDate.parse("1997-02-24"), 1.31, 30.5f);
		Student s4 = new Student(null,"279.019.554-32", "Rebeca Maria", "Sucupira", "(81)98475-6724", "rebeca@gmail.com",LocalDate.parse("1997-03-30"), 1.71, 65.5f);
		Student s5 = new Student(null,"453.019.554-32", "Oberly Mercia", "Sucupira", "(81)94878-6724", "oberly@gmail.com",LocalDate.parse("1997-04-18"), 1.78, 70.5f);
		Student s6 = new Student(null,"783.019.554-32", "José Felix", "Sucupira", "(81)98351-6724", "jose@gmail.com",LocalDate.parse("1997-04-18"), 1.79, 72.5f);
		
		studentRepository.saveAll(Arrays.asList(s1, s2, s3, s4, s5, s6));
	}
	
}
