package com.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/states")
	public ArrayList<States> getList(){
		return customerService.getStateList();
	}
	
	@RequestMapping(method=RequestMethod.POST,value = "/states")
	public void addStates(@RequestBody States s) {
		customerService.addStates(s);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value = "/states/{id}")
	public void updateState(@RequestBody States s,@PathVariable int id){
		customerService.updateState(s,id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/states/{id}")
	public void deleteState(@PathVariable int id) {
		customerService.deleteState(id);
	}
		

}
	

