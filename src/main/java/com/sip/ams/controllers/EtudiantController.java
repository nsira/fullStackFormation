package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EtudiantController {
    @RequestMapping("list")
    //@ResponseBody
	public String  listEtudiants() {
		return "listeEtudiants";
	}
	@RequestMapping("add")
	//@ResponseBody
	public String addEtudinat() {
		return "addEtudiant";
		
	}
}
