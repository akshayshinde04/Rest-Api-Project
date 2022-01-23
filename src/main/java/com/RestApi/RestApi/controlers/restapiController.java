package com.RestApi.RestApi.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restapi")
public class restapiController {
	@RequestMapping("/hellomsg")
	public String helloMsg() {
		return "Hello from Bridgelabz";
	}
	
	@RequestMapping (value = {"/query"}, method = RequestMethod.GET)
	public String helloMsg(@RequestParam (value = "name") String name) {
		return "Hello" + name + "!";
	}
	
	
}
