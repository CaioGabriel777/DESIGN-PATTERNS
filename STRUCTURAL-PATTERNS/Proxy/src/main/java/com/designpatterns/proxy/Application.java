package com.designpatterns.proxy;

import com.designpatterns.proxy.storage.DocumentStorage;
import com.designpatterns.proxy.storage.oci.OciRealStorage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		// The Client only interacts with the Proxy
		DocumentStorage storage = new OciRealStorage();

		System.out.println("--- Request 1: Unauthorized User ---");
		storage.downloadDocument("contracheque_01.pdf", "GUEST");

		System.out.println("\n--- Request 2: Authorized User (Cache Miss) ---");
		storage.downloadDocument("contracheque_01.pdf", "ADMIN");

		System.out.println("\n--- Request 3: Same Document Again (Cache Hit) ---");
		storage.downloadDocument("contracheque_01.pdf", "ADMIN");
	}

}
