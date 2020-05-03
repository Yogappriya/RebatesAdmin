package com.rebatesadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class RebatesAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(RebatesAdminApplication.class, args);
	}

}
