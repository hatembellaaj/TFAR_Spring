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

import tn.mdweb.dsi.tfar.converter.UserConverter;
import tn.mdweb.dsi.tfar.domain.dto.UserDto;
import tn.mdweb.dsi.tfar.domain.entity.Departement;
import tn.mdweb.dsi.tfar.domain.entity.Organisme;
import tn.mdweb.dsi.tfar.domain.entity.User;
import tn.mdweb.dsi.tfar.enumeration.Gouvernorat;
import tn.mdweb.dsi.tfar.enumeration.RoleType;
import tn.mdweb.dsi.tfar.enumeration.TypeUser;
import tn.mdweb.dsi.tfar.service.UserService;


@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserConverter userConverter;

	// get all users
	@GetMapping("/findAll")
	public List<UserDto> getAllUsers() {
		List<User> findAll = userService.listAll();
		return userConverter.entityToDto(findAll);
	}

	// get user by code
	@GetMapping("/find/{code}")
	public UserDto getUserById(@PathVariable(value = "code") Long id) {
		User user = userService.get(id);
		return userConverter.entityToDto(user);
	}

	// create user
	@PostMapping("/save")
	public UserDto save(@RequestBody UserDto userDto) throws Exception {
		return userConverter.entityToDto(userService.save(userDto));
	}

	// update user
	@PutMapping("/save/{code}")
	public UserDto updateUser(@RequestBody UserDto userDto,
			@PathVariable("code") Long id) throws Exception {
		User existinguser = userService.get(id);
		/*existinguser.setRole(RoleType.valueOf(userDto.getRole()));
		existinguser.setType(TypeUser.valueOf(userDto.getType()));*/
		
		existinguser.setRole(userDto.getRole());
		existinguser.setType(userDto.getType());
		existinguser.setNom(userDto.getNom());
		existinguser.setPrenom(userDto.getPrenom());
		existinguser.setGrade(userDto.getGrade());
		
		/*existinguser.setGouvernorat(Gouvernorat.valueOf(userDto.getGouvernorat()));*/
		
		existinguser.setGouvernorat(userDto.getGouvernorat());
		existinguser.setAdresse(userDto.getAdresse());
		existinguser.setTel(userDto.getTel());
		existinguser.setEmail(userDto.getEmail());
		existinguser.setPhoto(userDto.getPhoto());
		existinguser.setPoste(userDto.getPoste());
		existinguser.setFax(userDto.getFax());
		existinguser.setLogin(userDto.getLogin());
		existinguser.setPassword(userDto.getPassword());
		existinguser.setUrl(userDto.getUrl());
		existinguser.setOrganisme(new Organisme(userDto.getCodeOrganisme()));
		existinguser.setDepartement(new Departement(userDto.getCodeDepartement()));
		UserDto x=userConverter.entityToDto(existinguser);
		return userConverter.entityToDto(userService.save(x));
	}

	// delete user by code
	@DeleteMapping("delete/{code}")
	public String deleteUser(@PathVariable("code") Long id) {
		User existinguser = userService.get(id);
		userService.delete(id);
		return existinguser.toString() +  " is deleted";
	}

}
