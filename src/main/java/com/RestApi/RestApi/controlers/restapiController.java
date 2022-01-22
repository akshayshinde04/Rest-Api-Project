package com.RestApi.RestApi.controlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restapi")
public class restapiController {
	@RequestMapping("/hellomsg")
	public String helloMsg() {
		return "Hello from Bridgelabz";
	}
}
