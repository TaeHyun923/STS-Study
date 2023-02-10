package com.exe.springwebview;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {

		return "home";
	}

	@RequestMapping(value = "pdfView.action")
	public ModelAndView getPdfView() {

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setView(new CustomPdfView());
		modelAndView.addObject("message", "PDF FILE");

		return modelAndView;

	}
	
	@RequestMapping(value = "excelView.action")
	public ModelAndView getExcelView() {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setView(new CustomExcelView());
		
		return modelAndView;
	}

}
