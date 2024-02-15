package com.elevenidias.xedfit.config;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.elevenidias.xedfit.entities.PersonalTrainer;
import com.elevenidias.xedfit.entities.ScheduledClass;
import com.elevenidias.xedfit.entities.Student;
import com.elevenidias.xedfit.repositories.PersonalTrainerRepository;
import com.elevenidias.xedfit.repositories.ScheduledClassRepository;
import com.elevenidias.xedfit.repositories.StudentRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private PersonalTrainerRepository personalTrainerRepository;
	
	@Autowired
	private ScheduledClassRepository scheduledClassRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Student s1 = new Student(null,"112.019.554-32", "Filipe Gabriel", "Sucupira", "(81)98494-6724", "filipe@gmail.com",LocalDate.parse("1997-04-18"), 1.81, 65.5f);
		Student s2 = new Student(null,"725.019.554-32", "Mariana Maria", "Sucupira", "(81)99353-6724", "mariana@gmail.com",LocalDate.parse("1997-02-24"), 1.71, 60.5f);
		Student s3 = new Student(null,"843.019.554-32", "Alice Maria", "Sucupira", "(81)98464-6724", "alice@gmail.com",LocalDate.parse("1997-02-24"), 1.31, 30.5f);
		Student s4 = new Student(null,"279.019.554-32", "Rebeca Maria", "Sucupira", "(81)98475-6724", "rebeca@gmail.com",LocalDate.parse("1997-03-30"), 1.71, 65.5f);
		Student s5 = new Student(null,"453.019.554-32", "Oberly Mercia", "Sucupira", "(81)94878-6724", "oberly@gmail.com",LocalDate.parse("1997-04-18"), 1.78, 70.5f);
		Student s6 = new Student(null,"783.019.554-32", "José Felix", "Sucupira", "(81)98351-6724", "jose@gmail.com",LocalDate.parse("1997-04-18"), 1.79, 72.5f);
		
		PersonalTrainer pt1 = new PersonalTrainer(null, "112.019.554-32", "1234", "Sergio Personal", Instant.now(), "Santo Amaro", "(81)98561-5514", "sergiopersonal@gmail.com", LocalDate.of(1982, 1, 26));
		PersonalTrainer pt2 = new PersonalTrainer(null, "738.045.738-35", "7984", "Lara Personal", Instant.now(), "Santo Amaro", "(81)98561-5514", "larapersonal@gmail.com", LocalDate.of(1996, 5, 30));
		PersonalTrainer pt3 = new PersonalTrainer(null, "718.438.123-52", "1866", "Hugo Personal", Instant.now(), "Santo Amaro", "(81)98561-5514", "hugopersonal@gmail.com", LocalDate.of(1969, 2, 9));
		PersonalTrainer pt4 = new PersonalTrainer(null, "394.279.786-48", "1843", "Matheus Personal", Instant.now(), "Santo Amaro", "(81)98561-5514", "matheuspersonal@gmail.com", LocalDate.of(1994, 10, 12));
		PersonalTrainer pt5 = new PersonalTrainer(null, "513.634.247-36", "4459", "Aline Personal", Instant.now(), "Santo Amaro", "(81)98561-5514", "alinepersonal@gmail.com", LocalDate.of(1991, 9, 10));
		
		studentRepository.saveAll(Arrays.asList(s1, s2, s3, s4, s5, s6));
		personalTrainerRepository.saveAll(Arrays.asList(pt1, pt2, pt3, pt4, pt5));
		
		ScheduledClass sc1 = new ScheduledClass(s6, pt5, LocalDateTime.parse("22/04/2024 11:00", dtf2), LocalDateTime.parse("22/04/2024 11:00", dtf2), LocalDateTime.parse("22/04/2024 12:00", dtf2));
		ScheduledClass sc2 = new ScheduledClass(s1, pt4, LocalDateTime.parse("22/04/2024 17:00", dtf2), LocalDateTime.parse("22/04/2024 17:00", dtf2), LocalDateTime.parse("22/04/2024 18:00", dtf2));
		ScheduledClass sc3 = new ScheduledClass(s2, pt4, LocalDateTime.parse("23/04/2024 13:00", dtf2), LocalDateTime.parse("23/04/2024 13:00", dtf2), LocalDateTime.parse("23/04/2024 14:00", dtf2));
		ScheduledClass sc4 = new ScheduledClass(s3, pt1, LocalDateTime.parse("23/04/2024 15:00", dtf2), LocalDateTime.parse("23/04/2024 15:00", dtf2), LocalDateTime.parse("23/04/2024 16:00", dtf2));
		ScheduledClass sc5 = new ScheduledClass(s5, pt1, LocalDateTime.parse("23/04/2024 08:00", dtf2), LocalDateTime.parse("23/04/2024 08:00", dtf2), LocalDateTime.parse("23/04/2024 09:00", dtf2));
		ScheduledClass sc6 = new ScheduledClass(s4, pt3, LocalDateTime.parse("24/04/2024 10:00", dtf2), LocalDateTime.parse("24/04/2024 10:00", dtf2), LocalDateTime.parse("24/04/2024 11:00", dtf2));
		ScheduledClass sc7 = new ScheduledClass(s1, pt2, LocalDateTime.parse("24/04/2024 12:00", dtf2), LocalDateTime.parse("24/04/2024 12:00", dtf2), LocalDateTime.parse("24/04/2024 13:00", dtf2));
				
		sc1.setDuration(sc1.duration());
		sc2.setDuration(sc2.duration());
		sc3.setDuration(sc3.duration());
		sc4.setDuration(sc4.duration());
		sc5.setDuration(sc5.duration());
		sc6.setDuration(sc6.duration());
		sc7.setDuration(sc7.duration());
		
		scheduledClassRepository.saveAll(Arrays.asList(sc1, sc2, sc3, sc4, sc5, sc6, sc7));
		
	}	
}
