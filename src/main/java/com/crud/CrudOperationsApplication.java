package com.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudOperationsApplication {//implements CommandLineRunner{

	/*@Autowired
	private UserRepository userRepository;*/
	
	public static void main(String[] args) {
		System.getProperties().put( "server.port", 6002);

		SpringApplication.run(CrudOperationsApplication.class, args);
	}

	/*@Override
	public void run(String... arg0) throws Exception {
		userRepository.save(new User("Ravi","Sitale"));
		userRepository.save(new User("bhadru","vadageri"));
		userRepository.save(new User("Sumit","A"));
	}*/
	
	
}
