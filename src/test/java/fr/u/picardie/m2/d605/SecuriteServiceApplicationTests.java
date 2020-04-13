package fr.u.picardie.m2.d605;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class SecuriteServiceApplicationTests {

	@Test
	void contextLoads() {
		System.out.println(new BCryptPasswordEncoder().encode("admin"));
	}

}
