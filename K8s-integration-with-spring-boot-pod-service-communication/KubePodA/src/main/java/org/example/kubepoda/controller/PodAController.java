package org.example.kubepoda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PodAController {

	@GetMapping("/getPodA")
	public String getPodA() {
		return "Hello from PodA-Service Call";
	}

}