package com.manoj.test.mail;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component("manojmail")
public class ManojEmail {
	
	
	@Autowired
	private JavaMailSender sender;

	public boolean send(
			String to,
			String cc[],
			String bcc[],
			String subject,
			String text
			//,Resource file 
			)
	{
		boolean flag=false;
		try {
		MimeMessage message =sender.createMimeMessage();
		
			MimeMessageHelper helper=new MimeMessageHelper(message
					//, file!=null?true:false
							);
			helper.setTo(to);
			if(cc!=null &&  cc.length>0)
			helper.setCc(cc);
			if(bcc!=null &&  bcc.length>0)
			helper.setBcc(bcc);
			helper.setSubject(subject);
			helper.setText(text);
			//if(file!=null)
				//helper.addAttachment(file.getFilename(), file);
				
			sender.send(message);
			flag=true;
		} catch (Exception e) {
			flag=false;
			e.printStackTrace();
		}
		return flag;
		
	}
}
