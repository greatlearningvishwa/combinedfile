package com.microservice.combined.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Combinedcontroller {
private RestTemplate restTemplate;

@GetMapping("/gbook")
public String getbook() {
	restTemplate=new RestTemplate();
	String out=restTemplate.getForObject("http://localhost:8080/get", String.class);
	return out;
}

@GetMapping("/abook")
public String addbook(int id,String name,String author) {
	restTemplate=new RestTemplate();
	String out=restTemplate.getForObject("http://localhost:8080/addbook?id=" +id+ "&name=" +name+ "&author=" +author,String.class);
	return out;
}
@GetMapping("/dbook")
public String deletebook(int id) {
	restTemplate=new RestTemplate();
	String out=restTemplate.getForObject("http://localhost:8080/deletebook/?id="+id, String.class);
	return out;
}
@GetMapping("/gcus")
public String getcustomer() {
	restTemplate=new RestTemplate();
	String out=restTemplate.getForObject("http://localhost:8081/getlist", String.class);
	return out;
}
@GetMapping("/acus")
public String addcustomer() {
	restTemplate=new RestTemplate();
	String out=restTemplate.getForObject("http://localhost:8081/addcustomer", String.class);
	return out;
}
}
