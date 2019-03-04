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

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("allTires", tireDAO.findAll());
		return "WEB-INF/index.jsp";
	}

	@RequestMapping(path = "getTire.do", method = RequestMethod.GET)
	public ModelAndView getTire(@RequestParam("tid") int tid) {
		ModelAndView mv = new ModelAndView();
		Tire tire = tireDAO.findById(tid);
		mv.addObject("tire", tire);
		mv.setViewName("WEB-INF/tire/show.jsp");
		return mv;
	}

	@RequestMapping(path = "addTire.do", method = RequestMethod.POST)
	public ModelAndView createTire(@Valid Tire tire) throws SQLException {
		ModelAndView mv = new ModelAndView();
//		boolean isTireAddedSuccessful = tireDAO.create(tire);
		tire = tireDAO.create(tire);

//		mv.addObject("editTire", isTireAddedSuccessful);
		mv.addObject("addTire", tire);
		mv.setViewName("WEB-INF/tire/edit.jsp");
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

	@RequestMapping(path = "editTire.do", method = RequestMethod.GET)
	public ModelAndView editTire(Tire tire) throws SQLException {
		ModelAndView mv = new ModelAndView();
		Tire updateTireObj = tireDAO.findById(tire.getId());
		System.out.println(updateTireObj);
		mv.addObject("editTire", updateTireObj);
		mv.setViewName("WEB-INF/edit.jsp");
		return mv;
	}

	@RequestMapping(path = "deleteFilm.do", method = RequestMethod.POST)
	public ModelAndView deleteTire(int tireId) throws SQLException {
		ModelAndView mv = new ModelAndView();
		boolean isSuccessful = tireDAO.delete(tireId);
		mv.addObject("removed", isSuccessful);
		mv.setViewName("WEB-INF/index.jsp");
		if (!isSuccessful) {
			return null;
		}
		return mv;
	}
}