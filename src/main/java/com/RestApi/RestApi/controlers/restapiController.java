package com.RestApi.RestApi.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.RestApi.RestApi.model.User;

@RestController
@RequestMapping("/restapi")
public class restapiController {
	@RequestMapping("/hellomsg")
	public String helloMsg() {
		return "Hello from Bridgelabz";
	}
	
	@RequestMapping (value = {"/query"}, method = RequestMethod.GET)
	public String helloMsg(@RequestParam (value = "name") String name) {
		return "Hello " + name + " ! ";
	}
	
	@GetMapping ("/param/{name}")
	public String helloMsgParam(@PathVariable String name) {
		return "Hello " + name + " Join the Meeting ";
	}
	
	@PostMapping ("/post")
	public String helloMsg(@RequestBody User user) {
		return "Hello " + user.getFirstName() + " " + user.getLastName();
	}
}