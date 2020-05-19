package com.thiagopereira80.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagopereira80.workshopmongo.domain.User;
import com.thiagopereira80.workshopmongo.repository.UserRepository;

@Service
public class UserService {

			
		@Autowired
		private UserRepository repo;
		
		public List<User> findAll() {
			return repo.findAll();
		}

}
