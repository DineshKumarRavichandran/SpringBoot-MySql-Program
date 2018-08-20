package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Users;
import com.example.demo.repository.UsersRepository;

@Service
public class UsersService {
	@Autowired
	UsersRepository usersRepository;

	public List<Users> getAllUser() {
		return usersRepository.findAll();
	}

	public List<Users> postUser(Users users) {
		usersRepository.save(users);
		return usersRepository.findAll();
	}

	public List<Users> getUsersBySalary(Integer salary) {

		return usersRepository.findBySalary(salary);
	}

	public Optional<Integer> getSalary(Integer id) {
		return usersRepository.findSalaryById(id);
	}
}
