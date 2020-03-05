package com.cts.training.userservice;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@CrossOrigin(origins="*")
@RestController
public class RegisterRestController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

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
	
	@GetMapping("/registerall/{id}")
	public ResponseEntity<Register> getById(@PathVariable int id){
		Register reg = registerservice.getUserById(id);
		return new ResponseEntity<Register>(reg,HttpStatus.OK);
	}
	
	@DeleteMapping("/registerall/{id}")
	public void delete(@PathVariable int id) {
		registerservice.deleteById(id);
	}
	
	@PutMapping("/registerall")
	public ResponseEntity<Register> update(@RequestBody Register users){
		registerservice.updateUser(users);
		return new ResponseEntity<Register>(users,HttpStatus.OK);
	}

	
	@RequestMapping(value = "/registerall",method = RequestMethod.POST)
	public ResponseEntity<Register> save(@RequestBody Register rd){
		registerservice.insert(rd);
		return new ResponseEntity<Register>(rd,HttpStatus.CREATED);
		
	}
	@RequestMapping(value="/registerall/activate",method= RequestMethod.PUT)
	public ResponseEntity<String> activate(@RequestBody String email){
		registerservice.activate(email);
		return new ResponseEntity<String>(email,HttpStatus.CREATED);
		
	}
	
}
