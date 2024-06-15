package com.test.pgdb.postgresdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.pgdb.postgresdemo.dao.Student;

@SpringBootApplication
public class PostgresdemoApplication implements CommandLineRunner {

	@Autowired
	private Student student;

	public static void main(String[] args) {
		SpringApplication.run(PostgresdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.student.createTable();
	}

}
