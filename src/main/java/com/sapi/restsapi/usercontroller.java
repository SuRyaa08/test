package com.sapi.restsapi;

import com.sapi.restsapi.entity.user;
import com.sapi.restsapi.entity.repository.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class usercontroller {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/users")
	public List<user> getAllusers(){
		
		List<user> userlist = userRepository.findAll();
		/*user u1 = new user(1l,"surya","S", 21,"Male",10,"CSE","a","A",1);
		user u2 = new user(2l,"ramesh","S", 21,"Male",10,"CSE","b","A",1);
		user u3 = new user(3l,"suresh","S", 21,"Male",10,"CSE","c","A",1);
		

		userlist.add(u1);
		userlist.add(u2);
		userlist.add(u3);*/
		
		return userlist;

		
	}
	
	@PostMapping("/users")
	public user createUser(@RequestBody user user){
		user dbUser = userRepository.save(user);
		
		return dbUser;
	}
	
	@PutMapping("/users/{id}")
	public user updateUser(@RequestBody user user, @PathVariable("id") Long id){
		
		user updateUserData = userRepository.getById(id);
		
		updateUserData.setId(user.getId());
		updateUserData.setFname(user.getFname());
		updateUserData.setLname(user.getLname());
		updateUserData.setAge(user.getAge());
		updateUserData.setGender(user.getGender());
		updateUserData.setStudying(user.getStudying());
		updateUserData.setDepartment(user.getDepartment());
		updateUserData.setSection(user.getSection());
		updateUserData.setGrade(user.getGrade());
		updateUserData.setFloor(user.getFloor());


		
		user dbUser = userRepository.save(updateUserData);
		
		return dbUser;
	}

}
