package com.TaskDevop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Task")
public class TaskController {
	
	@GetMapping("/TaskName")
	public String getMethodName() {
		return "DevopTask";
	}
	
	@GetMapping("/UseTools")
	public String getToolname() {
		return "Here We use Jenkins,Putty and AWS Tool for hosting our Local application to remote";
	}
	@GetMapping("/name/{a}")
	public String getName(@PathVariable String a) {
		return "hey "+a+" you're a Unique and Well talented person beleive that ✨";
	}
	
	
}
