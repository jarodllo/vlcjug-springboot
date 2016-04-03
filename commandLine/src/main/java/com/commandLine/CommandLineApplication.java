package com.commandLine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableConfigurationProperties(Geeting.class)
public class CommandLineApplication implements CommandLineRunner{

	@Autowired
	private Geeting geeting;

	public static void main(String[] args)
	{
		SpringApplication.run(CommandLineApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		System.out.println(geeting.getGeeting());
	}
}



@Configuration
@EnableConfigurationProperties(Geeting.class)
public class MyConfiguration {


}