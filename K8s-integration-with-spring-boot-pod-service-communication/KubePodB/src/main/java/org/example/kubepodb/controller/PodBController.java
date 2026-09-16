package org.example.kubepodb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PodBController {

    private final RestTemplate restTemplate;
    private final String podABaseUrl;

    public PodBController(RestTemplate restTemplate,
                          @Value("${pod-a.base-url}") String podABaseUrl) {
        this.restTemplate = restTemplate;
        this.podABaseUrl = podABaseUrl;
    }


	@GetMapping("/call-pod-B")
	public String callPodB() {
		 String response = restTemplate.getForObject(podABaseUrl + "/api/getPodA", String.class);
        return "Response from PodA:Service Comm  " + response;
	}
}