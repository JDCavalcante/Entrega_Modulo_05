package br.com.devtur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class HomeController {
	
	 @GetMapping
	    public ModelAndView home() {
	        ModelAndView modelAndView = new ModelAndView("/index");

	        return modelAndView;
	    }
	 
	 @GetMapping("/sobre")
	    public ModelAndView sobre() {
	        ModelAndView modelAndView = new ModelAndView("/sobre");


	        return modelAndView;
	    }
	 
	 @GetMapping("/destino")
	    public ModelAndView destino() {
	        ModelAndView modelAndView = new ModelAndView("/destino");


	        return modelAndView;
	    }
	 
	 @GetMapping("/contato")
	    public ModelAndView contato() {
	        ModelAndView modelAndView = new ModelAndView("/contato");


	        return modelAndView;
	    }
	 
	 @GetMapping("/promocoes")
	    public ModelAndView promocoes() {
	        ModelAndView modelAndView = new ModelAndView("/promocoes");


	        return modelAndView;
	    }
	 
	 @GetMapping("/login")
	    public ModelAndView login() {
	        ModelAndView modelAndView = new ModelAndView("/login");


	        return modelAndView;
	 
	 }
}
