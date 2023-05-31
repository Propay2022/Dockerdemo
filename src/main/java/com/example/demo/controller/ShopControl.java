package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Shopping;
import com.example.demo.repo.ShopRepo;


@RestController
public class ShopControl {
	
	@Autowired
	private ShopRepo shopRepo;
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Docker Image Demo";
	}
	
	@GetMapping("/findAll")
	public List<Shopping> getAllProduct(){
		return shopRepo.findAll();
	}
	@PostMapping("/insert")
	public String insert(@RequestBody Shopping shop) {
		 shopRepo.save(shop);
		 return "Product added";
	}
	

}