package fr.formation.parking.ihm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.formation.parking.bo.Parking;

@Controller
public class ParkController {
	
	@GetMapping("/listpark")
	public String liste(Model model) {
		List<Parking> lst = new ArrayList<>();
		lst.add(new Parking("Quimper",18));
		lst.add(new Parking("Carhaix",16));
		lst.add(new Parking("Brest",38));
		lst.add(new Parking("Crozon",6));
		model.addAttribute("list", lst);
		return "listpark";
	}
	

}
