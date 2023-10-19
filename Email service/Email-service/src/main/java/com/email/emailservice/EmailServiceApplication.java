package com.email.emailservice;

import org.springframework.boot.SpringApplication;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import jakarta.mail.MessagingException;

@SpringBootApplication
public class EmailServiceApplication {

	@Autowired
	private EmailSenderService emailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(EmailServiceApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {

		// emailSenderService.sendSimpleEmail(
		// "mktintumon2@gmail.com",
		// "Testing mail from springBoot",
		// "Spring Mail"
		// );

		String filePath = "C:\\Users\\HP\\Pictures\\Screenshots\\marks.png";
		Path path = Paths.get(filePath);

		if (Files.exists(path)) {
			emailSenderService.sendEmailAttachment(
					"mktintumon2@gmail.com",
					"Testing mail from springBoot with attachment",
					"Spring Mail Attachment",
					filePath);
		} else {
			System.out.println("File not found at: " + filePath);
		}

	}
}
