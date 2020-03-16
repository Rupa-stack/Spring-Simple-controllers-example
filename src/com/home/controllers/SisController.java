package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//multi action controller
@Controller
@RequestMapping("/sis")
public class SisController {

	@ResponseBody
	@RequestMapping("/kit")
	public String giveMakeUpKit()
	{
		return "Make up Kit!!";
	}
	//@ResponseBody
	@RequestMapping("/book")
	
	public String getBooks()
	{
		return "cookbook";
	}
}
