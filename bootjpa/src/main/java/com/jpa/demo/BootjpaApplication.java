package com.jpa.demo;

import java.util.Iterator;
//import java.util.List;
//import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.demo.dao.UserRepositoty;
import com.jpa.demo.entities.User;

@SpringBootApplication
public class BootjpaApplication {

	public static void main(String[] args) {
	   ApplicationContext context = SpringApplication.run(BootjpaApplication.class, args);
	    
	   UserRepositoty userRepo = context.getBean(UserRepositoty.class);
	   
	   // CREATE USERS
	   /*
	   User user1 = new User();
	   user1.setName("Mohit kumar");
	   user1.setCity("banglore");
	   user1.setProfile("developer");
	   
	   User user2 = new User();
	   user2.setName("Raman kumar");
	   user2.setCity("Patna");
	   user2.setProfile("Banker");
	   */
	   
	   /* for saving single entity only
	    
	   User u1 = userRepo.save(user);
	   User u2 = userRepo.save(user2);
	   */
	   
	   /* for saving multiple entity
	    
	   List<User> users = List.of(user1,user2);
	   Iterable<User> result = userRepo.saveAll(users);
	   
	   result.forEach(user ->{
		   System.out.println(user);
	   });
	   */
	   
	   
	   // UPDATING DATA
	   /*
	   Optional<User> optional =  userRepo.findById(153);
	   User getUser = optional.get();
	   
	   getUser.setName("Kanika Kumari");
	   getUser.setCity("Pune");
	   getUser.setProfile("Actor");
	   
	   User result = userRepo.save(getUser);
	   System.out.println(result);
	   */
	   
	   
	   
	   // GET ALL DATA
	   Iterable<User> itr = userRepo.findAll();  // -> returns Iterable data
	   Iterator<User> iterator = itr.iterator();	  // -> we uses iterator
	   
	   
	   // OR we use for-each
	   while(iterator.hasNext()) {
		   System.out.println(iterator.next());
	   }
	   
	   
	   // DELETE DATA
	   // userRepo.deleteById(153);
	   
		//	   Iterable<User> allUsers = userRepo.findAll();
		//	   userRepo.deleteAll(allUsers);
	   
	   System.out.println("DONE successfully");
	}

}
