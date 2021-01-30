package com.manoj.test.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;
@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private ManojEmail mail;
	@Override
	public void run(String... args) throws Exception {
		
		FileSystemResource file1= new FileSystemResource("F:\\manojmohanty\\hello brothers");
		
	boolean flag=mail.send( 
				"mohanty2175@gmail.com"
				,
				new String[] { 
                     "ajitsuansia95@gmail.com","Nabin.kumar.321@gmail.com"
                     ,"maheshkumarmaharana111@gmail.com"
				},
				null,
				"hello first mail ",
				"manoj mohanty"
				//,file1
				);
	
	if(flag) {
		System.out.println("success");
	}else {
		System.out.println("failed");
	}
	}
	

}
