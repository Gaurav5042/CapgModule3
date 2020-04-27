package com.sunsoft.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sunsoft.entity.TraineeSpringJPA;
import com.sunsoft.service.ITraineeService;

@Controller
@RequestMapping("/Trainee")
public class TraineeController {

	private static final Logger LOG = LoggerFactory.getLogger(TraineeController.class);
	
	@Autowired
	private ITraineeService tmpService; //empService;
	
	@GetMapping("/list")
	public String listCustomer(Model theModel)
	{
		System.out.println("Hello World");
		List<TraineeSpringJPA> theTrainees = tmpService.getTrainees();
		theModel.addAttribute("trainees",  theTrainees) ;   // trainees ==employees
		System.out.println("List of Data : "+ theTrainees);
		return "list-trainee";		
	}
	
	@GetMapping("/showForm")
	 public String showFormForAdd(Model theModel){
		LOG.debug("inside show customer-form handler method");
		TraineeSpringJPA theTrainee = new TraineeSpringJPA();
		theModel.addAttribute("trainee",theTrainee);
		
		return "Trainee-form";	
		
	}
	
	@PostMapping("/saveEmployee")
	public String saveCustomer(@ModelAttribute("trainee") TraineeSpringJPA theTrainee)
	{
		tmpService.saveTrainee(theTrainee);
		return "redirect:/Trainee/list";
	}
	
	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("traineeId") int theId, Model theModel){
		Optional<TraineeSpringJPA> theTrainee = tmpService.getTrainee(theId);
		theModel.addAttribute("trainee", theTrainee);
		return "Trainee-form";
		
	}
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("traineeId") int theId){
		tmpService.deleteTrainee(theId);
		return "redirect:/Trainee/list";
	}

}
