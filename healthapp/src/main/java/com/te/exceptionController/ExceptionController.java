package com.te.exceptionController;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.te.customException.InvalidCredentials;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(InvalidCredentials.class)
	public String invalidDetails(InvalidCredentials ip, ModelMap map) {
		map.addAttribute("msg", ip.toString());
		return "error_page";

	}

}
