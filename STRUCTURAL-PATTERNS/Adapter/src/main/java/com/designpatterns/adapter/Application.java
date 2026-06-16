package com.designpatterns.adapter;

import com.designpatterns.adapter.notification.NotificationService;
import com.designpatterns.adapter.notification.gov.GovSmsAdapter;
import com.designpatterns.adapter.notification.gov.LegacyGovSmsAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		// Our system only knows about the NotificationService interface!

		LegacyGovSmsAPI oldSystem = new LegacyGovSmsAPI();
		NotificationService notificationService = new GovSmsAdapter(oldSystem);

		// The client code stays clean and modern
		notificationService.send("dev@teste.com", "Server deployment successful.");
	}
}
