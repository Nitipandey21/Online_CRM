package com.springdemo.CustomerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.entity.Customer;
import com.springdemo.entity.CustomerDao;
import com.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerservice;
	@GetMapping("/list")
	public String listCustomer(Model m)
	{
		List<Customer> d= customerservice.getCustomers();
		m.addAttribute("cs",d);
		
		return "list-customer";
		
	}
	
	@GetMapping("/addForm")
	public  String addForm(Model m)
	{
		Customer  c=new Customer();
		
		m.addAttribute("customer","c");
		return "customer-add";
		
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer cd) {
		customerservice.saveCustomer(cd);
		return "redirect:/customer/list";
	
	}
	
}
