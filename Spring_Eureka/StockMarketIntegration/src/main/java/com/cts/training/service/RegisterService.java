package com.cts.training.service;

import java.util.List;

import com.cts.training.dto.RegisterDto;
import com.cts.training.model.Register;

public interface RegisterService {
	public Register insert(Register rd);
	public void deleteById(int id);
	public String activate(String email);
	public Register updateUser(Register users);
	public List<Register> getAllUsers();
	public Register getUserById(int id);

}
