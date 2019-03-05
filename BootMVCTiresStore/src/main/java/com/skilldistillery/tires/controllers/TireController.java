package com.skilldistillery.tires.controllers;

import java.sql.SQLException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.tiredata.entities.Tire;
import com.skilldistillery.tires.data.TireDAO;

@Controller
public class TireController {

	@Autowired
	private TireDAO tireDAO;

	@RequestMapping(path = { "/", "home.do" }, method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("allTires", tireDAO.findAll());
		return "WEB-INF/index.jsp";
	}

	@RequestMapping(path = "getTire.do", method = RequestMethod.GET)
	public ModelAndView getTire(@RequestParam("tid") int tireId) {
		ModelAndView mv = new ModelAndView();
		Tire tire = tireDAO.findById(tireId);
		mv.addObject("tire", tire);
		mv.setViewName("WEB-INF/tire/show.jsp");
		System.out.println("in get tire.do");
		System.out.println("################ getTire.do " + tire);
		return mv;
	}

	@RequestMapping(path = "addTire.do", method = RequestMethod.GET)
	public ModelAndView sendToTireCreate() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("WEB-INF/addTire.jsp");
		return mv;
	}

	@RequestMapping(path = "addTire.do", method = RequestMethod.POST)
	public ModelAndView createTire(@Valid Tire tire) throws SQLException {
		ModelAndView mv = new ModelAndView();
//		boolean isTireAddedSuccessful = tireDAO.create(tire);
		tire = tireDAO.create(tire);

//		mv.addObject("editTire", isTireAddedSuccessful);
		mv.addObject("addTire", tire);
		mv.setViewName("WEB-INF/tire/show.jsp");
		return mv;

//		if (!isTireAddedSuccessful) {
//			mv.setViewName("WEB-INF/errorPage.jsp");
//			return mv;
//		} else {
//			mv.addObject("editTire", tire);
//			mv.setViewName("WEB-INF/tire/edit.jsp");
//			return mv;
//		}

	}

	@RequestMapping(path = "editTire.do", method = RequestMethod.POST)
	public ModelAndView editTire(int tireId, Tire tire) throws SQLException {
		ModelAndView mv = new ModelAndView();
//		tireDAO.update(tireId, tire);
		System.out.println("################ editTire.do " + tire);
		System.out.println(tireId);
		tireDAO.update(tireId, tire);
		mv.addObject("editTire", tire);
		mv.setViewName("WEB-INF/tire/show.jsp");
		return mv;
	}

	@RequestMapping(path = "deleteTire.do", method = RequestMethod.POST)
	public ModelAndView deleteTire(int tireId, Tire tire) throws SQLException {
		ModelAndView mv = new ModelAndView();
		boolean isSuccessful = tireDAO.delete(tireId);
		mv.addObject("removed", isSuccessful);
		mv.setViewName("WEB-INF/index.jsp");
		return mv;
	}
}