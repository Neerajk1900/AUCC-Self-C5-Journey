package com.MyTests;



import java.io.File;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;













public class Sendemailsdemo {
		public static void main(String[] args) {
			
			System.out.println("Preparing to send message ...");
			String message = "Hello , Dear, Please find Extent Report . ";
			String subject = "Extent Report";
			String to = "Nitesh.kumar@decimal.co.in";
			String from = "Neeraj.kishore@decimal.co.in";
			
//			sendEmail(message,subject,to,from);
			sendAttach(message,subject,to,from);
		}

		//this is responsible to send the message with attachment
		private static void sendAttach(String message, String subject, String to, String from) {

			//Variable for gmail
			String host="smtp.gmail.com";
			
			//get the system properties
			Properties properties = System.getProperties();
			System.out.println("PROPERTIES "+properties);
			
			//setting important information to properties object
			
			//host set
			properties.put("mail.smtp.host", host);
			properties.put("mail.smtp.port","465");
			properties.put("mail.smtp.ssl.enable","true");
			properties.put("mail.smtp.auth","true");
			
			//Step 1: to get the session object..
			Session session=Session.getInstance(properties, new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {				
					return new PasswordAuthentication("Neeraj.kishore@decimal.co.in", "pdyr adnf ebbb jkao");
				}
				
				
				
			});
			
			session.setDebug(true);
			
			//Step 2 : compose the message [text,multi media]
			MimeMessage m = new MimeMessage(session);
			
			try {
			
			//from email
			m.setFrom(from);
			
			//adding recipient to message
			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			
			//adding subject to message
			m.setSubject(subject);
		
			
			//attachement..
			
			//file path
			String path="C:\\Users\\neeraj.kishore\\eclipse-workspace\\AUCC_C5_Journey\\test-output\\ExtentReports\\extentReport.html";
			
			
			MimeMultipart mimeMultipart = new MimeMultipart();
			//text
			//file
			
			MimeBodyPart textMime = new MimeBodyPart();
			
			MimeBodyPart fileMime = new MimeBodyPart();
			
			try {
				
				textMime.setText(message);
				
				File file=new File(path);
				fileMime.attachFile(file);
				
				
				mimeMultipart.addBodyPart(textMime);
				mimeMultipart.addBodyPart(fileMime);
			
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
			m.setContent(mimeMultipart);
			
			
			//send 
			
			//Step 3 : send the message using Transport class
			Transport.send(m);
			
			
			
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
		
			System.out.println("Sent success...................");
			
			
		}

		//this is responsible to send email..
		private static void sendEmail(String message, String subject, String to, String from) {
			
			//Variable for gmail
			String host="smtp.gmail.com";
			
			//get the system properties
			Properties properties = System.getProperties();
			System.out.println("PROPERTIES "+properties);
			
			//setting important information to properties object
			
			//host set
			properties.put("mail.smtp.host", host);
			properties.put("mail.smtp.port","465");
			properties.put("mail.smtp.ssl.enable","true");
			properties.put("mail.smtp.auth","true");
			
			//Step 1: to get the session object..
			Session session=Session.getInstance(properties, new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {				
					return new PasswordAuthentication("Neeraj.kishore@decimal.co.in", "pdyr adnf ebbb jkao");
				}
				
			
			});
			
			session.setDebug(true);
			
			//Step 2 : compose the message [text,multi media]
			MimeMessage m = new MimeMessage(session);
			
			try {
			
			//from email
			m.setFrom(from);
			
			//adding recipient to message
			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			
			//adding subject to message
			m.setSubject(subject);
		
			
			//adding text to message
			m.setText(message);
			
			//send 
			
			//Step 3 : send the message using Transport class
			Transport.send(m);
			
			System.out.println("Sent success...................");
			
			
			}catch (Exception e) {
				e.printStackTrace();
			}
				
		}
	}


