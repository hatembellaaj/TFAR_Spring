package tn.mdweb.dsi.tfar.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.mdweb.dsi.tfar.domain.entity.User;
import tn.mdweb.dsi.tfar.service.UserService;


@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;

	// get all users
	@GetMapping("/findAll")
	public List<User> getAllUsers() {
		List<User> findAll = userService.listAll();
		return findAll;
	}

	// get user by code
	@GetMapping("/find/{code}")
	public User getUserById(@PathVariable(value = "code") Long id) {
		User user = userService.get(id);
		return user;
	}

	// create user
	@PostMapping("/save")
	public User save(@RequestBody User user) throws Exception {
		return userService.save(user);
	}

	// update user
	@PutMapping("/save/{code}")
	public User updateUser(@RequestBody User user,
			@PathVariable("code") Long id) throws Exception {
		User existinguser = userService.get(id);
		existinguser.setRole(user.getRole());
		existinguser.setType(user.getType());
		existinguser.setNom(user.getNom());
		existinguser.setPrenom(user.getPrenom());
		existinguser.setGrade(user.getGrade());
		existinguser.setGouvernorat(user.getGouvernorat());
		existinguser.setAdresse(user.getAdresse());
		existinguser.setTel(user.getTel());
		existinguser.setEmail(user.getEmail());
		existinguser.setPhoto(user.getPhoto());
		existinguser.setPoste(user.getPoste());
		existinguser.setFax(user.getFax());
		existinguser.setLogin(user.getLogin());
		existinguser.setPassword(user.getPassword());
		existinguser.setUrl(user.getUrl());
		existinguser.setOrganisme(user.getOrganisme());
		existinguser.setDepartement(user.getDepartement());
		return userService.save(existinguser);
	}

	// delete user by code
	@DeleteMapping("delete/{code}")
	public String deleteUser(@PathVariable("code") Long id) {
		User existinguser = userService.get(id);
		userService.delete(id);
		return existinguser.toString() +  " is deleted";
	}

}
