package com.example.hoge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.hoge.form.ContactForm;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class ContactController {
	ContactForm form;
	
	@GetMapping("/top")
	public String top() {
		return "contact/Top";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact/Contact";
	}
	
	@PostMapping("/post-contact")
	public String confirm(
			@Validated
			@ModelAttribute
			ContactForm form,
			Model model,
			BindingResult result) {
			if(result.hasErrors()) {
				return "contact/Contact";
			}
			model.addAttribute("form",form);
		return "contact/Confirm";
	}
	
	@PostMapping("/post-form")
	public String postconfirm(
			) {
		return "redirect:/contact/success";
	}
	
	@GetMapping("/contact/success")
	public String formSuccess() {
		return "contact/success";
	}
}
