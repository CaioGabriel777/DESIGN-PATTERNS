package com.designpatterns.singleton;

import com.designpatterns.singleton.database.DatabaseConnectionManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		// Both variables point to the EXACT same object in memory!
		DatabaseConnectionManager connection1 = DatabaseConnectionManager.getInstance();
		DatabaseConnectionManager connection2 = DatabaseConnectionManager.getInstance();

		System.out.println(connection1 == connection2);
	}

}
