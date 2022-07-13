package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SendMailApplication
{
     @Autowired
     private Service_Class send;
	
	
	
	public static void main(String[] args) 
	{
		SpringApplication.run(SendMailApplication.class, args);
	}
	
	
	@EventListener(ApplicationReadyEvent.class)   
	public void sendMail() //send Receiver email here......
	{
		send.sendEmail("testing_sender@gmail.com","Developed Email Sender",
				"Hi,"
				+ "I'm Ayush Susheel I have successfully developed the email sender spring boot application using the java email sender library."
						
				+ "Thank You,"
				+ "Ayush "
				
				
				
				); 
		
	}
	

}
