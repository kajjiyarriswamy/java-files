package com.te.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.customException.InvalidCredentials;
import com.te.dto.Doctors;
import com.te.service.ServiceInt;

@Controller
public class MyController {

	@Autowired
	private ServiceInt ser;

	@GetMapping("/homePage")
	public String getHomePage() {

		return "home";
	}

	@GetMapping("/loginPage")
	public String getLoginPage() {

		return "login";
	}

	@GetMapping("/signupPage")
	public String getsignupPage() {

		return "signup";
	}

	@GetMapping("/signupForDoc")
	public String getSignupForDoc() {

		return "docSignUp";
	}

	@GetMapping("/signupForPat")
	public String getSignupForPat() {

		return "patSignUp";
	}

	@PostMapping("/docSign")
	public String signUpDoc(Doctors doc, ModelMap map) {
		if (ser.signUpDoc(doc)) {
			map.addAttribute("msg", "Sucessfully registered");
			map.addAttribute("doc", doc);
		} else {
			map.addAttribute("msg", "Failed to registered");
		}

		return "docCon";
	}

	@PostMapping("/logout")
	public String logout() {

		return "home";
	}

	@PostMapping("/loginForPat")
	public String loginForPat(int aadharNumber, String password, ModelMap map) {

		if (ser.loginForPat(aadharNumber, password)) {
			map.addAttribute("msg", "Login sucessful");

		} else {

			throw new InvalidCredentials();
		}
		return "loginConPat";

	}

	@PostMapping("/loginForDoc")
	public String loginForDoc(int id, String password, ModelMap map) {

		if (ser.loginForDoc(id, password)) {
			map.addAttribute("msg", "Login sucessful");

		} else {

			throw new InvalidCredentials();
		}
		return "loginCon";

	}

}
