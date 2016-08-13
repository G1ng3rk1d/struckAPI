package ca.gkwb.struckto.api.main;

import org.springframework.boot.SpringApplication;

import ca.gkwb.struckto.api.controller.ApiController;

public class StruckToApiMain {

	public static void main(String[] args) {
		SpringApplication.run(ApiController.class, args);
	}	
}
