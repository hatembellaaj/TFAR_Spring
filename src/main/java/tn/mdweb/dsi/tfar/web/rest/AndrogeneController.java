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
import tn.mdweb.dsi.tfar.domain.entity.Androgene;
import tn.mdweb.dsi.tfar.service.AndrogeneService;

@RestController
@RequestMapping("/api/androgenes")
public class AndrogeneController {
	
	@Autowired
	private AndrogeneService androgeneService;

	// get all androgenes
	@GetMapping("/findAll")
	public List<Androgene> getAllAndrogenes() {

		List<Androgene> findAll = androgeneService.listAll();
		return findAll;
	}

	// get androgene by id
	@GetMapping("/find/{id}")
	public Androgene getAndrogeneById(@PathVariable(value = "id") long id) {
		Androgene androgene = androgeneService.get(id);
		return androgene;
	}

	// create androgene
	@PostMapping("/save")
	public Androgene save(@RequestBody Androgene androgene) {
		return androgeneService.save(androgene);
	}
	

	
	// update androgene
	@PutMapping("/save/{id}")
	public Androgene updateAndrogene(@RequestBody Androgene androgene, @PathVariable("id") long id) {
		Androgene existingandrogene = androgeneService.get(id);
		existingandrogene.setMois(androgene.getMois());
		existingandrogene.setReponse(androgene.getReponse());
		existingandrogene.setFiche(androgene.getFiche());
		return androgeneService.save(existingandrogene);
	}
	
	
	// delete androgene by id
		@DeleteMapping("delete/{id}")
		public String deleteAndrogene(@PathVariable("id") long id) {
			Androgene existingandrogene = androgeneService.get(id);
			androgeneService.delete(id);
			return existingandrogene.toString() + " is deleted";
		}


}
