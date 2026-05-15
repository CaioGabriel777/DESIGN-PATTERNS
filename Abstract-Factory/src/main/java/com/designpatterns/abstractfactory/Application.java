package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.workspace.backend.BackendWorkstationFactory;
import com.designpatterns.abstractfactory.workspace.mobile.MobileWorkstationFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		System.out.println("\nBACKEND");
		BackendWorkstationFactory backend = new BackendWorkstationFactory();
		backend.createIDE().openProject();
		backend.createDatabaseClient().connect();

		System.out.println("\nMOBILE");
		MobileWorkstationFactory mobile = new MobileWorkstationFactory();
		mobile.createIDE().openProject();
		mobile.createDatabaseClient().connect();
	}

}
