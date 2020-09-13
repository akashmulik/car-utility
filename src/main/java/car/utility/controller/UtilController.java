package car.utility.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import car.utility.entity.Utility;
import car.utility.service.UtilityService;

@RestController
public class UtilController {
	
	@Autowired
	UtilityService us;

	@PostMapping("/utility")
	public ResponseEntity<Utility> addUtility(@RequestBody Utility u) {

		return new ResponseEntity<>(us.addUtility(u), HttpStatus.CREATED);
	}
	
	@GetMapping("/utility")
	public ResponseEntity<List<Utility>> getUtilities() {
		
		List<Utility> utils = us.getAllUtilities();
		return new ResponseEntity<>(utils, HttpStatus.OK);
	}
}
