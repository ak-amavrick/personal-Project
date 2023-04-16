package com.FlightProject2.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.FlightProject2.DAO.FlightRepo;
import com.FlightProject2.Entity.Flight;

@Controller
public class FlightController {

	@Autowired
	private FlightRepo flightrepo;
	
//	 @RequestMapping("/flightDetails")
//	 public String FlightDetails(@ModelAttribute("flight")Flight flight ) {
//		 flightrepo.save(flight);
//		 return"findFlights";
//	 }

	

	@RequestMapping("/findFlights")
	public String findFlights(@RequestParam("from") String from , @RequestParam("to") String to, ModelMap model) {
	List<Flight> findFlights = flightrepo.findFlights(from,to);
		model.addAttribute("findFlights", findFlights);
		return "displayFlights";
		}
}
	

