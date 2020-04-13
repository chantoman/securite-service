package fr.u.picardie.m2.d605.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.u.picardie.m2.d605.security.bean.User;
import fr.u.picardie.m2.d605.security.dao.UserDao;

@RestController
@RequestMapping("userAll")
public class UserController {

//	@Autowired
//	private PasswordEncoder passwordEncoder;
//
	@Autowired
	private UserDao userDao;
//	/**
//	 * This assembler help us to generate pagination links
//	 */
//	@Autowired
//	private PagedResourcesAssembler<User> pagedResourcesAssembler;
//
//	@PostMapping
//	public ResponseEntity<Object> createBean(@Valid @RequestBody User user) {
//		user.setPassword(passwordEncoder.encode(user.getPassword()));
//		user = userDao.save(user);
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId())
//				.toUri();
//		return ResponseEntity.created(location).build();
//	}
//
//	@PutMapping
//	public ResponseEntity<Object> updateBean(@Valid @RequestBody User user) {
//		user = userDao.save(user);
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId())
//				.toUri();
//		return ResponseEntity.created(location).build();
//
//	}
//
	@GetMapping
	public List<User> findAll(Pageable pageable) {
		List<User> allBeans = userDao.findAll(pageable).getContent();
		return allBeans;
	}
//
//	@GetMapping("{login}")
//	public EntityModel<User> findByLogin(@PathVariable String login) {
//		User savedUser = userDao.findByLogin(login);
//		if (savedUser == null) {
//			throw new NotFoundBeanException("user not found");
//		}
//		EntityModel<User> emTutorBean = new EntityModel<User>(savedUser);
//		WebMvcLinkBuilder linkToAllTutor = WebMvcLinkBuilder
//				.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).findAll(null));
//		emTutorBean.add(linkToAllTutor.withRel("list"));
////		WebMvcLinkBuilder linkToSutdentById = WebMvcLinkBuilder
////				.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).findById(id));
////		emTutorBean.add(linkToSutdentById.withRel("self"));
//		return emTutorBean;
//	}
//
//	@GetMapping("/authenticat")
//	public EntityModel<User> authenticate(@RequestBody User user) {
//		User savedUser = userDao.findByLogin(user.getLogin());
//		if (savedUser == null) {
//			throw new NotFoundBeanException("user not found");
//		}
//		if (!passwordEncoder.matches(savedUser.getPassword(),user.getPassword())) {
//			throw new NotFoundBeanException("user not found");
//		}
//		EntityModel<User> emTutorBean = new EntityModel<User>(savedUser);
////		WebMvcLinkBuilder linkToAllTutor = WebMvcLinkBuilder
////				.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).findAll(null));
////		emTutorBean.add(linkToAllTutor.withRel("list"));
////		WebMvcLinkBuilder linkToSutdentById = WebMvcLinkBuilder
////				.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).findById(savedUser.getId()));
////		emTutorBean.add(linkToSutdentById.withRel("self"));
//		return emTutorBean;
//	}
//
//	@DeleteMapping("{id}")
//	public void deleteById(@PathVariable String id) {
//		userDao.deleteById(id);
//	}
}
