package tn.mdweb.dsi.tfar.converter;

import java.util.List;

import org.springframework.stereotype.Component;
import java.util.stream.Collectors;
import tn.mdweb.dsi.tfar.domain.dto.UserDto;
import tn.mdweb.dsi.tfar.domain.entity.Departement;
import tn.mdweb.dsi.tfar.domain.entity.Organisme;
import tn.mdweb.dsi.tfar.domain.entity.User;
import tn.mdweb.dsi.tfar.enumeration.Gouvernorat;
import tn.mdweb.dsi.tfar.enumeration.RoleType;
import tn.mdweb.dsi.tfar.enumeration.TypeUser;

@Component
public class UserConverter {

	public UserDto entityToDto(User user) {

		/*
		 * UserDto map = new
		 * UserDto(user.getCode(),user.getRole().name(),user.getType().name(),user.
		 * getNom(),user.getPrenom(),user.getGrade(),user.getGouvernorat().name(),user.
		 * getAdresse(),
		 * user.getTel(),user.getEmail(),user.getPhoto(),user.getPoste(),user.getFax(),
		 * user.getLogin(),user.getPassword(),user.getUrl(),user.getOrganisme().getCode(
		 * ), user.getDepartement().getCode());
		 */

		UserDto map = new UserDto(user.getCode(), user.getRole(), user.getType(), user.getNom(), user.getPrenom(),
				user.getGrade(), user.getGouvernorat(), user.getAdresse(), user.getTel(), user.getEmail(),
				user.getPhoto(), user.getPoste(), user.getFax(), user.getLogin(), user.getPassword(), user.getUrl(),
				user.getOrganisme().getCode(), user.getOrganisme().getNom(), user.getDepartement().getCode(),
				user.getDepartement().getNom());

		return map;
	}

	public List<UserDto> entityToDto(List<User> user) {

		return user.stream().map(x -> entityToDto(x)).collect(Collectors.toList());

	}

	public User dtoToEntity(UserDto userDto) {

		/*
		 * User map = new User(userDto.getCode()
		 * ,RoleType.valueOf(userDto.getRole()),TypeUser.valueOf(userDto.getType()),
		 * userDto.getNom(),userDto.getPrenom(),userDto.getGrade(),
		 * Gouvernorat.valueOf(userDto.getGouvernorat()),userDto.getAdresse(),
		 * userDto.getTel(),userDto.getEmail(),userDto.getPhoto(),userDto.getPoste(),
		 * userDto.getFax(),userDto.getLogin(),userDto.getPassword(),userDto.getUrl(),
		 * new Organisme(userDto.getCodeOrganisme()), new
		 * Departement(userDto.getCodeDepartement()));
		 */

		User map = new User(userDto.getCode(), userDto.getRole(), userDto.getType(), userDto.getNom(),
				userDto.getPrenom(), userDto.getGrade(), userDto.getGouvernorat(), userDto.getAdresse(),
				userDto.getTel(), userDto.getEmail(), userDto.getPhoto(), userDto.getPoste(), userDto.getFax(),
				userDto.getLogin(), userDto.getPassword(), userDto.getUrl(),
				new Organisme(userDto.getCodeOrganisme(), userDto.getNomOrganisme()),
				new Departement(userDto.getCodeDepartement(), userDto.getNomDepartement()));

		return map;
	}

	public List<User> dtoToEntity(List<UserDto> userDto) {

		return userDto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}

}
