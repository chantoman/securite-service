package fr.u.picardie.m2.d605.security.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import fr.u.picardie.m2.d605.security.bean.User;

@Component
public interface UserDao extends MongoRepository<User, String> {
	User findByLogin(String login);

	User findByEmail(String email);

}
