package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class Service_Class 
{

	@Autowired
	private JavaMailSender mailSender;
	
	void sendEmail(String toEmail,String subject,String body)
	{
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("testing@gmail.com");  //write the sender email ID here 
		message.setTo(toEmail);
		message.setText(body);
		message.setSubject(subject);
		
		mailSender.send(message);
		
		System.out.println("mail sent successfully........");
		
		
		
	}
	
}
