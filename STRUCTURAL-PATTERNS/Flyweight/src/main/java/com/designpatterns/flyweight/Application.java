package com.designpatterns.flyweight;

import com.designpatterns.flyweight.employee.EmployeeBadge;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		// 10.000 employees, but only 2 heavy Theme objects are ever created!

		EmployeeBadge dev1 = new EmployeeBadge("Caio", "DevOps", 10, 20, "IT");
		EmployeeBadge dev2 = new EmployeeBadge("Luan", "Senior Mobile", 10, 40, "IT");
		EmployeeBadge dev3 = new EmployeeBadge("Gabriel", "Junior Backend", 10, 60, "IT");

		EmployeeBadge hr1 = new EmployeeBadge("Ana", "Recruiter", 50, 20, "HR");
		EmployeeBadge hr2 = new EmployeeBadge("Pedro", "HR Manager", 50, 40, "HR");

		dev1.draw();
		dev2.draw();
		dev3.draw();
		hr1.draw();
		hr2.draw();
	}

}
