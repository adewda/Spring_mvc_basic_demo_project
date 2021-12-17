package com.ajaylovescoding.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	//add an initbinder...to convert or trim input strings
	//removing leading and trailing white space
	//resolve issue for our validation
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
	}
	
	
	
	
	
	
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		Customer theCustomer = new Customer();
		
		theModel.addAttribute("customer",theCustomer);
		
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer")Customer theCustomer,
			BindingResult theBindingResult) {    //spring will place the result in 
		                                         //bindingresult

		System.out.println("lastname : |" + theCustomer.getLastname() + "|");
		
		
		System.out.println("Binding result : "+theBindingResult);
		System.out.println("\n\n\n\n");
		
		
		if(theBindingResult.hasErrors()) {
			return "customer-form";
		}
		else {
		//log the input data		
				System.out.println("theCustomer: "+ theCustomer.getFirstname()+
						" "+theCustomer.getLastname());
				
				return "customer-confirmation";
		}
		}
	
	
}
