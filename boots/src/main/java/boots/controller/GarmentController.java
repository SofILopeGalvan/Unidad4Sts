package boots.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boots.model.Garment;
import boots.service.GarmentService;

@Controller
public class GarmentController {

	@Autowired
	private GarmentService garmentService;
	
	
	@GetMapping ("/all-garments")
	public String allGarments(HttpServletRequest request){
		request.setAttribute("garments", garmentService.findAll());
		request.setAttribute("mode","MODE_GARMENTS");
		return "garment";
	}
	
	@GetMapping ("/new-garment")
	public String newGarment(HttpServletRequest request){
		request.setAttribute("mode","MODE_NEW");
		return "garment";
	}
	
	@GetMapping ("/update-garment")
	public String updateGarment(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("garment", garmentService.findOne(id));
		request.setAttribute("mode","MODE_UPDATE");
		return "garment";
	}
	
	@GetMapping ("/delete-garment")
	public String deleteGarment(@RequestParam int id, HttpServletRequest request){
		garmentService.delete(id);
		request.setAttribute("garments", garmentService.findAll());
		request.setAttribute("mode","MODE_GARMENTS");
		return "garment";
	}
	
	@PostMapping("/save-garment")
	public String saveGarment(@ModelAttribute Garment garment, BindingResult bindingResult, HttpServletRequest request){
		garmentService.save(garment);
		request.setAttribute("garments", garmentService.findAll());
		request.setAttribute("mode","MODE_GARMENTS");
		return "garment";
	}
	
}
