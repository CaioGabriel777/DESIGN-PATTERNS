package com.designpatterns.composite;

import com.designpatterns.composite.element.MenuLink;
import com.designpatterns.composite.element.MenuSection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		// Creating single links / Leaves
		MenuLink profileLink = new MenuLink("My Profile", "/profile");
		MenuLink holidaysLink = new MenuLink("Holidays", "/hr/holidays");
		MenuLink paystubLink = new MenuLink("Paystubs", "/hr/paystubs");

		// Creating a section and adding links to it
		MenuSection hrSection = new MenuSection("Human Resources");
		hrSection.addElement(holidaysLink);
		hrSection.addElement(paystubLink);

		// Creating the main root menu
		MenuSection rootMenu = new MenuSection("Main Menu");
		rootMenu.addElement(profileLink);
		rootMenu.addElement(hrSection); // Adding a composite inside a composite!


		// The client simply calls render() on the top level.
		// It doesn't care if it is rendering a single link or a massive tree of folders!
		System.out.println("Building Intranet UI...");
		rootMenu.render();
	}

}
