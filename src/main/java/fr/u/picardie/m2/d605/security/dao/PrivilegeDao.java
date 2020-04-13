package fr.u.picardie.m2.d605.security.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import fr.u.picardie.m2.d605.security.bean.Role;
import fr.u.picardie.m2.d605.security.bean.Privilege;

@Component
public interface PrivilegeDao extends MongoRepository<Privilege, String> {

	public Role findByName(String name);
}
