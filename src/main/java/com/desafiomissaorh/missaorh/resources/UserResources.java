package com.desafiomissaorh.missaorh.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafiomissaorh.missaorh.models.User;
import com.desafiomissaorh.missaorh.repository.UserRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST User")
public class UserResources {
	
	@Autowired
	UserRepository userRepository;
	
		@ApiOperation(value="Retorna uma lista de usuarios")
		@GetMapping("/users")
		public List<User> listUsers() {
			return userRepository.findAll();
		
	}
		
		@ApiOperation(value="Retorna um usuario unico")
		@GetMapping("/user/{id}")
		public User listUserforId(@PathVariable(value="id") long id) {
			return userRepository.findById(id);
		
	}
		@ApiOperation(value="Salva um usuario unico")
		@PostMapping("/user")
		public User saveUser(@RequestBody User user) {
			return userRepository.save(user);
	}
	
		@ApiOperation(value="Deleta um usuario unico")
		@DeleteMapping("/user")
		public void deleteUser(@RequestBody User user) {
			 userRepository.delete(user);
			}
		
		@ApiOperation(value="Atualiza um usuario unico")
		@PutMapping("/user")
		public User updateUser(@RequestBody User user) {
			return userRepository.save(user);
			}

}
