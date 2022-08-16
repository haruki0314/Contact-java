package com.example.hoge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.hoge.form.ContactForm;
import com.example.hoge.service.ContactService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Controller
@Slf4j
public class ContactController {
	private final ContactService contactService;
	
	/**
	 * topPageのクラス
	 * @return
	 */
	@GetMapping("/top")
	public String top() {
		return "contact/Top";
	}
	
	/**
	 * お問合せページに飛ぶクラス
	 * @param form
	 * @param model
	 * @return
	 */
	@GetMapping("/contact")
	public String contact(
			@Validated
			@ModelAttribute 
			ContactForm form,
			Model model
			) {
		log.info("お問合せページ");
		return "contact/Contact";
	}
	
	/**
	 * 確認画面に飛ぶクラス
	 * @param form
	 * @param model
	 * @param result
	 * @return
	 */
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
			contactService.confirm(form);
			log.info("確認画面");
		return "contact/Confirm";
	}
	
	/**
	 * 確認ボタンを押下した時の処理
	 * @return
	 */
	@PostMapping("/post-form")
	public String postconfirm(
			) {
		return "redirect:/contact/success";
	}
	
	/**
	 * 成功した時の処理
	 * @return
	 */
	@GetMapping("/contact/success")
	public String formSuccess() {
		return "contact/success";
	}
}
