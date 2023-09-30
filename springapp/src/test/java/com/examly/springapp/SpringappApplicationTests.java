package com.examly.springapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.examly.springapp.model.Student;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

@SpringBootTest
class SpringappApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	void testStudentBean() {
		Student student = applicationContext.getBean(Student.class);
		student.setStudentId(123);
		student.setFirstName("John");
		student.setLastName("Doe");

		// Perform assertions
		assertEquals(123, student.getStudentId());
		assertEquals("John", student.getFirstName());
		assertEquals("Doe", student.getLastName());
	}

	@Autowired
	private MyApplicationRunner myApplicationRunner;

	@Test
	@ExtendWith(OutputCaptureExtension.class)
	public void testRun(CapturedOutput output) throws Exception {
		myApplicationRunner.run(null);
		assertThat(output).contains("Spring IoC project has started successfully!");
	}

	@Test

	public void modelfolder() {
		String directoryPath = "src/main/java/com/examly/springapp/model"; // Replace with the path to your
																			// directory
		File directory = new File(directoryPath);
		assertTrue(directory.exists() && directory.isDirectory());
	}

	@Test
	public void modelfile() {
		String filePath = "src/main/java/com/examly/springapp/model/Student.java";
		File file = new File(filePath);
		assertTrue(file.exists() && file.isFile());
	}

	public void configfolder() {
		String directoryPath = "src/main/java/com/examly/springapp/configuration"; // Replace with the path to your
		// directory
		File directory = new File(directoryPath);
		assertTrue(directory.exists() && directory.isDirectory());
	}

	@Test
	public void configfile() {
		String filePath = "src/main/java/com/examly/springapp/configuration/AppConfig.java";
		File file = new File(filePath);
		assertTrue(file.exists() && file.isFile());
	}

}
