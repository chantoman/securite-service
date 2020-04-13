package fr.u.picardie.m2.d605.security.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import fr.u.picardie.m2.d605.security.bean.Role;
import fr.u.picardie.m2.d605.security.dao.RoleDao;
import fr.u.picardie.m2.d605.security.exception.NotFoundBeanException;

//@RestController
//@RequestMapping("profiles")
public class ProfileController {

//	@Autowired
//	private ProfileDao profileDao;
//	/**
//	 * This assembler help us to generate pagination links
//	 */
//	@Autowired
//	private PagedResourcesAssembler<Profile> pagedResourcesAssembler;
//
//	@PostMapping
//	public ResponseEntity<Object> createBean(@Valid @RequestBody Profile profile) {
//		profile = profileDao.save(profile);
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(profile.getId())
//				.toUri();
//		return ResponseEntity.created(location).build();
//	}
//
//	@PutMapping
//	public ResponseEntity<Object> updateBean(@Valid @RequestBody Profile profile) {
//		profile = profileDao.save(profile);
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(profile.getId())
//				.toUri();
//		return ResponseEntity.created(location).build();
//
//	}
//
//	@GetMapping
//	public ResponseEntity<?> findAll(Pageable pageable) {
//		Page<Profile> allBeans = profileDao.findAll(pageable);
//		return new ResponseEntity<>(pagedResourcesAssembler.toModel(allBeans), HttpStatus.OK);
//	}
//
//	@GetMapping("{id}")
//	public EntityModel<Profile> findById(@PathVariable String id) {
//		Profile savedTutor = profileDao.findById(id).orElse(null);
//		if (savedTutor == null) {
//			throw new NotFoundBeanException("Profile not found");
//		}
//		EntityModel<Profile> emTutorBean = new EntityModel<Profile>(savedTutor);
//		WebMvcLinkBuilder linkToAllTutor = WebMvcLinkBuilder
//				.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).findAll(null));
//		emTutorBean.add(linkToAllTutor.withRel("list"));
//		WebMvcLinkBuilder linkToSutdentById = WebMvcLinkBuilder
//				.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).findById(id));
//		emTutorBean.add(linkToSutdentById.withRel("self"));
//		return emTutorBean;
//	}
//
//	@GetMapping("{name}")
//	public EntityModel<Profile> findByName(@PathVariable String name) {
//		Profile savedTutor = profileDao.findByName(name);
//		if (savedTutor == null) {
//			throw new NotFoundBeanException("Profile not found");
//		}
//		EntityModel<Profile> emTutorBean = new EntityModel<Profile>(savedTutor);
//		WebMvcLinkBuilder linkToAllTutor = WebMvcLinkBuilder
//				.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).findAll(null));
//		emTutorBean.add(linkToAllTutor.withRel("list"));
//		WebMvcLinkBuilder linkToSutdentById = WebMvcLinkBuilder
//				.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).findById(savedTutor.getId()));
//		emTutorBean.add(linkToSutdentById.withRel("self"));
//		return emTutorBean;
//	}
//
//	@DeleteMapping("{id}")
//	public void deleteById(@PathVariable String id) {
//		profileDao.deleteById(id);
//	}
}
