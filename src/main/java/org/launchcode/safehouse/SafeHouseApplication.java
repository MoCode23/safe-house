package org.launchcode.safehouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages="org.launchcode.safehouse.models")
public class SafeHouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SafeHouseApplication.class, args);
	}

}
