package com.semirdevops.docker.dockerspringboothello;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/docker-container")
public class DockerHelloWorld {

	@GetMapping
	public String getName() {
		
		return "Welcome to the semirdevops deployment in a docker container";
	}
}
