package com.codingdojo.variablesrutasdaikichi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping("")
	public String index() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will airse, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/travel/{place}")
	public String travel(@PathVariable("place") String place) {
		return "Contragulations! You will soon travel to " + place;
	}
	
	@RequestMapping("/lotto/{id}")
	public String lotto(@PathVariable("id") Integer id) {
		if (id % 2 == 0) {
			return "You will take a grand joruney in the near futurem but be wary of tempting offers";
		} else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}
}