package com.designpatterns.builder;

import com.designpatterns.builder.server.ServerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		ServerConfiguration basicServer =  new ServerConfiguration.Builder("192.168.0.1")
				.build();
		basicServer.printServerConfiguration();

		ServerConfiguration secureCluster = new ServerConfiguration.Builder("10.0.0.1")
				.port(443)
				.enableEncrypted()
				.clusterName("enterprise-prod-cluster")
				.build();
		secureCluster.printServerConfiguration();
	}

}
