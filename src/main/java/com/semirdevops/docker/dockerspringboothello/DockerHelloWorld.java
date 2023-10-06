package com.semirdevops.docker.dockerspringboothello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/docker-container")
@PageTitle("home")
public class DockerHelloWorld {

	@GetMapping
	public String getName() {
		
		return "Welcome to the semirdevops deployment in a docker container";
	}
}
