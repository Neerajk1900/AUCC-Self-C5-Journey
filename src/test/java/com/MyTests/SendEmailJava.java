package com.MyTests;



import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class SendEmailJava {

	public static void main(String[] args) throws EmailException, InterruptedException {
		SendEmail();

	}
		public static void SendEmail() throws EmailException, InterruptedException {
		
		EmailAttachment attachment = new EmailAttachment();
		try {
			attachment.setURL(new URL("file:C:\\Users\\neeraj.kishore\\eclipse-workspace\\AUCC_C5_Journey\\test-output\\ExtentReports\\extentReport.html"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setDescription("extent report url");
		attachment.setName("extent report url");

		// Create the email message	
		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("Neeraj.kishore@decimal.co.in", "pdyr adnf ebbb jkao"));
		email.setSSLOnConnect(true);
		try {
			email.setFrom("Neeraj.kishore@decimal.co.in");
		//	email.setFrom("Neeraj.kishore@gmail.com");
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		email.setSubject("TestMail");

		email.setMsg("file:C:\\Users\\neeraj.kishore\\eclipse-workspace\\AUCC_C5_Journey\\test-output\\ExtentReports\\extentReport.html");

		email.addTo("Neeraj.kishore@decimal.co.in");
		email.addTo("Neeraj.kishore@decimal.co.in");

		// add the attachment
		email.attach(attachment);

		// send the email
       email.send();
		System.out.println("email send"); 
	}
}


