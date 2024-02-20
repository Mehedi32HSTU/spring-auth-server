package com.javabeans.springauthserver;

import com.javabeans.springauthserver.entity.Role;
import com.javabeans.springauthserver.enums.RoleName;
import com.javabeans.springauthserver.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAuthServerApplication /*implements CommandLineRunner*/ {
	/*@Autowired
	RoleRepository roleRepository;*/

	public static void main(String[] args) {
		SpringApplication.run(SpringAuthServerApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		Role adminRole = Role.builder().role(RoleName.ROLE_ADMIN).build();
		Role userRole = Role.builder().role(RoleName.ROLE_USER).build();
		roleRepository.save(adminRole);
		roleRepository.save(userRole);
	}*/
}
