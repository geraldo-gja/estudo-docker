package com.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ping")
public class PingController {

	@GetMapping
	public String ping() {	
		String s = "tudo funcionando";
		System.out.println(s);
		return s;
	}
}
