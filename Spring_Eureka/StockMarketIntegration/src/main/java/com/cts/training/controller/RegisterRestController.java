package com.cts.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.dto.RegisterDto;
import com.cts.training.model.Register;
import com.cts.training.repo.RegisterRepo;
import com.cts.training.service.RegisterService;
@CrossOrigin(origins="*")
@RestController
public class RegisterRestController {

	@Autowired
	RegisterRepo ur;
	
	@Autowired
	JavaMailSender jms;
	
	@Autowired
	RegisterService registerservice;
	
	@GetMapping("/registerall")
	public ResponseEntity<?>getallusers() {
		List<Register> list = registerservice.getAllUsers();
		if(list.size()>0)
		{
			return new ResponseEntity<List<Register>>(list , HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("No users found",HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/registerid/{id}")
	public ResponseEntity<Register> getById(@PathVariable int id){
		Register reg = registerservice.getUserById(id);
		return new ResponseEntity<Register>(reg,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteregister/{id}")
	public void delete(@PathVariable int id) {
		registerservice.deleteById(id);
	}
	
	@PutMapping("/updateregister")
	public ResponseEntity<Register> update(@RequestBody Register users){
		registerservice.updateUser(users);
		return new ResponseEntity<Register>(users,HttpStatus.OK);
	}

	
	@RequestMapping(value = "/registerall",method = RequestMethod.POST)
	public ResponseEntity<Register> save(@RequestBody Register rd){
		registerservice.insert(rd);
		return new ResponseEntity<Register>(rd,HttpStatus.CREATED);
		
	}
	@RequestMapping(value="/activate",method= RequestMethod.PUT)
	public ResponseEntity<String> activate(@RequestBody String email){
		registerservice.activate(email);
		return new ResponseEntity<String>(email,HttpStatus.CREATED);
		
	}
	
}
