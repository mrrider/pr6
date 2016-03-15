package com.kozak;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class JdbcTestApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		Lecture lecture = new Lecture();
		lecture.setName("Introduction to Spring");
		lecture.setCredits(2.5);
		LecturesWorker worker = (LecturesWorker) context.getBean("worker");
		worker.addLecture(lecture);

	}
}
