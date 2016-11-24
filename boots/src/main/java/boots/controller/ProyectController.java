package boots.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boots.model.Proyect;
import boots.service.ProyectService;

@Controller
public class ProyectController {

	
	@Autowired
	private ProyectService proyectService;
	
	@GetMapping ("/all-proyects")
	public String allProyects(HttpServletRequest request){
		request.setAttribute("proyects", proyectService.findAll());
		request.setAttribute("mode","MODE_PROYECTS");
		return "proyect";
	}
	
	@GetMapping ("/new-proyect")
	public String newProyect(HttpServletRequest request){
		request.setAttribute("mode","MODE_NEW");
		return "proyect";
	}
	
	@GetMapping ("/update-proyect")
	public String updateProyect(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("proyect", proyectService.findOne(id));
		request.setAttribute("mode","MODE_UPDATE");
		return "proyect";
	}
	
	@GetMapping ("/delete-proyect")
	public String deleteProyect(@RequestParam int id, HttpServletRequest request){
		proyectService.delete(id);
		request.setAttribute("proyects", proyectService.findAll());
		request.setAttribute("mode","MODE_PROYECTS");
		return "proyect";
	}
	
	@PostMapping("/save-proyect")
	public String saveProyect(@ModelAttribute Proyect proyect, BindingResult bindingResult, HttpServletRequest request){
		proyectService.save(proyect);
		request.setAttribute("proyects", proyectService.findAll());
		request.setAttribute("mode","MODE_PROYECTS");
		return "proyect";
	}	
	
}
