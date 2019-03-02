package com.skilldistillery.tires.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skilldistillery.tires.data.TireDAO;

@Controller
public class TireController {

	@Autowired
	private TireDAO tireDAO;

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("allTires", tireDAO.findAll());
		return "WEB-INF/index.jsp";
	}
}
