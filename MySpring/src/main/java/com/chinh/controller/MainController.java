	package com.chinh.controller;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.chinh.Dao.PlayerDao;
import com.chinh.model.Player;

import org.springframework.stereotype.Controller;


@Controller
public class MainController {

	   @Autowired
	    private PlayerDao playerDAO;
	 
	   @RequestMapping(value = "/",method = RequestMethod.GET)
	   public ModelAndView listContact(ModelAndView model){
	      model=new ModelAndView("listContact");
		   List<Player> listContact = playerDAO.list();
	       model.addObject("chinh", "listContact");
	       
	       model.setViewName("home");
	       System.out.println("caS"+model.getStatus());
	       System.out.println("list contact: "+listContact.size());
	       return model;
	   }
	     
	}