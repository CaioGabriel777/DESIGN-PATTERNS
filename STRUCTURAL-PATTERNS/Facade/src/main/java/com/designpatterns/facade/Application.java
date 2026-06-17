package com.designpatterns.facade;

import com.designpatterns.facade.onboarding.OnboardingFacade;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		// The client code is incredibly clean! It doesn't know about the VPN or the DB.
		OnboardingFacade orgOnboarding = new OnboardingFacade();
		orgOnboarding.onboardNewEmployee("Caio");
		orgOnboarding.onboardNewEmployee("Luan");
	}

}
