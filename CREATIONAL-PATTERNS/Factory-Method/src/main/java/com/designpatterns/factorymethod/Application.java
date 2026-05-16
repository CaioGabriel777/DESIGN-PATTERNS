package com.designpatterns.factorymethod;

import com.designpatterns.factorymethod.workspace.factory.AnalystWorkspaceFactory;
import com.designpatterns.factorymethod.workspace.factory.InternWorkspaceFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		AnalystWorkspaceFactory analyst = new AnalystWorkspaceFactory();
		InternWorkspaceFactory intern = new InternWorkspaceFactory();

		analyst.provisionWorkspace();

		intern.provisionWorkspace();
	}
}