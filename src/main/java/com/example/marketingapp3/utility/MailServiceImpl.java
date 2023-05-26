package com.example.marketingapp3.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailServiceImpl implements MailService {
	
	@Autowired
	JavaMailSender mailSender;

	@Override
	public void sendMail(String to, String sub, String msg) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(to);
		message.setSubject(sub);
		message.setText(msg);
		mailSender.send(message);
	}

}
