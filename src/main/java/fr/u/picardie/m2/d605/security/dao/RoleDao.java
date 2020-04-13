package fr.u.picardie.m2.d605.security.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import fr.u.picardie.m2.d605.security.bean.Role;

@Component
public interface RoleDao extends MongoRepository<Role, String> {

	public Role findByName(String name);
}
