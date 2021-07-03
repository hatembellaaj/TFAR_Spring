package tn.mdweb.dsi.tfar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.mdweb.dsi.tfar.converter.UserConverter;
import tn.mdweb.dsi.tfar.domain.dto.UserDto;
import tn.mdweb.dsi.tfar.domain.entity.Departement;
import tn.mdweb.dsi.tfar.domain.entity.Organisme;
import tn.mdweb.dsi.tfar.domain.entity.User;
import tn.mdweb.dsi.tfar.exception.ValidationException;
import tn.mdweb.dsi.tfar.repository.DepartementRepository;
import tn.mdweb.dsi.tfar.repository.OrganismeRepository;
import tn.mdweb.dsi.tfar.repository.UserRepository;

@Service
public class UserService {
	

	@Autowired
	private UserRepository userRepository;


	@Autowired
	private UserConverter userConverter;

	@Autowired
	private DepartementRepository depRepository;

	@Autowired
	private OrganismeRepository orgRepository;

	public List<User> listAll() {
		return userRepository.findAll();	
	}

	public User save(UserDto userDto) throws ValidationException {
		Long codeOrg = userDto.getCodeOrganisme();
		List<Organisme> organismes = orgRepository.findAll();
		Organisme x = organismes.stream().filter(h -> h.getCode().equals(codeOrg)).findAny().orElse(null);
		if (x == null) {
			throw new ValidationException("The organisme is not found.");
		}

		Long codeDep = userDto.getCodeDepartement();
		List<Departement> departements = depRepository.findAll();
		Departement y = departements.stream().filter(h -> h.getCode().equals(codeDep)).findAny().orElse(null);
		if (y == null) {
			throw new ValidationException("The departement is not found.");
		}

		User user = userConverter.dtoToEntity(userDto);
		userRepository.save(user);
		return user;
	}

	public User get(long id) {
		return userRepository.findById(id).get();
	}

	public void delete(long id) {
		userRepository.deleteById(id);
	}

	/*public User update(User user) throws ValidationException {


		Long codeOrg = user.getOrganisme().getCode();
		List<Organisme> organismes = orgRepository.findAll();
		Organisme x = organismes.stream().filter(h -> h.getCode().equals(codeOrg)).findAny().orElse(null);
		if (x == null) {
			throw new ValidationException("The organisme is not found.");
		}

		Long codedep = user.getDepartement().getCode();
		List<Departement> departements = depRepository.findAll();
		Departement y = departements.stream().filter(h -> h.getCode().equals(codedep)).findAny().orElse(null);
		if (y == null) {
			throw new ValidationException("The departement is not found.");
		}
		userRepository.save(user);
		return user;
	}*/

}
