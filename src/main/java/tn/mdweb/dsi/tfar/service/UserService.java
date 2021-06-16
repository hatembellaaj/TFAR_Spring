package tn.mdweb.dsi.tfar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.mdweb.dsi.tfar.domain.entity.User;
import tn.mdweb.dsi.tfar.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> listAll() {
		return userRepository.findAll();	
	}
	
	public User save(User user) {
		userRepository.save(user);
		return user;
	}
	
	public User get(long id) {
		return userRepository.findById(id).get();
	}
	
	public void delete(long id) {
		userRepository.deleteById(id);
	}
	

}
