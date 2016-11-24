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
import boots.model.Task;
import boots.model.Garment;
import boots.service.ProyectService;
import boots.service.TaskService;
import boots.service.GarmentService;

@Controller
public class MainController {

	@GetMapping("/")
	public String home(HttpServletRequest request){
		 request.setAttribute("mode", "MODE_HOME");
		return "index";
	}
	
	@GetMapping("/task")
	public String task(HttpServletRequest request){
		 request.setAttribute("mode", "MODE_TASK");
		return "task";
	}
	
	@GetMapping("/garment")
	public String user(HttpServletRequest request){
		 request.setAttribute("mode", "MODE_GARMENT");
		return "garment";
	}
	
	@GetMapping("/proyect")
	public String proyect(HttpServletRequest request){
		 request.setAttribute("mode", "MODE_PROYECT");
		return "proyect";
	}
}