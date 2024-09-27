package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class EtudiantController {
    @RequestMapping("list")
    //@ResponseBody
	public String  listEtudiants(Model model) {
    	int total =15;
    	String trainer = "Amine";
    	model.addAttribute("totalStudent",total);
    	model.addAttribute("trainerStudent",trainer);
		return "listeEtudiants";
	}
	@RequestMapping("add")
	//@ResponseBody
	public String addEtudinat() {
		return "addEtudiant";
		
	}
	@RequestMapping("SaveEtudiant")
	@ResponseBody
	public String saveEtudiant(@RequestParam("nomEtudiant") String nom)
	{
		return "vous etes : " +nom;
	}
}
