package com.senoo.mysqljdbcdriversample;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequiredArgsConstructor
public class MysqlJdbcDriverSampleApplication {

	final StudentsRepository studentsRepository;

	public static void main(String[] args) {
		SpringApplication.run(MysqlJdbcDriverSampleApplication.class, args);
	}

	@GetMapping
	public List<Students> getStudents() {
		return studentsRepository.findAll();
	}

	@PostMapping
	public Students postStudent(@RequestBody Students students) {
		return studentsRepository.save(students);
	}

}