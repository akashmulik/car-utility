package car.utility.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import car.utility.entity.Utility;
import car.utility.repository.UtilityRepository;

@Service
public class UtilityService {

	@Autowired
	UtilityRepository repo;
	
	public Utility addUtility(Utility entity) {
		return repo.save(entity);
	}

	public List<Utility> getAllUtilities() {
		return repo.findAll();
	}
}
