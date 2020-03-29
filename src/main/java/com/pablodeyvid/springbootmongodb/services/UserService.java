package com.pablodeyvid.springbootmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pablodeyvid.springbootmongodb.domain.User;
import com.pablodeyvid.springbootmongodb.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		System.out.println(repo.findAll());
		return repo.findAll();
	}
}