package com.designpatterns.prototype;

import com.designpatterns.prototype.profile.AccessProfile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		// We load the heavy profile once.
		List<String> defaultPermissions = List.of("READ_REPOS", "WRITE_CODE", "ACCESS_JIRA");
		AccessProfile standardBackendProfile = new AccessProfile("Backend Developer", defaultPermissions);

		// We clone it for a new hire instead of creating from scratch.
		AccessProfile seniorBackendProfile = standardBackendProfile.cloneProfile();

		// We just tweak what is different
		seniorBackendProfile.addPermission("APPROVE_PULL_REQUESTS");
		seniorBackendProfile.addPermission("PROD_DATABASE_READ");

		standardBackendProfile.printProfile();
		seniorBackendProfile.printProfile();
	}

}
