package com.pablodeyvid.springbootmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pablodeyvid.springbootmongodb.domain.User;
import com.pablodeyvid.springbootmongodb.repository.UserRepository;
import com.pablodeyvid.springbootmongodb.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List< User> findAll() {
		System.out.println(repo.findAll());
		return repo.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}