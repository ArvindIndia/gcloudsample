package com.gcloud.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping(value="/", method=RequestMethod.GET, produces=MediaType.ALL_VALUE)
	public String deafultMessage() {
		return "Welcome Home";
	}
	
	@RequestMapping(value="/hello/{message}", method=RequestMethod.GET, produces=MediaType.ALL_VALUE)
	public String helloMessage(@PathVariable String message) {
		return "Welcome " + message;
	}
}
