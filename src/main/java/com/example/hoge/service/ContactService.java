package com.example.hoge.service;

import org.springframework.stereotype.Service;

import com.example.hoge.form.ContactForm;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ContactService {
	/**
	 * お問合せフォーム処理
	 * @param form
	 * @return
	 */
	public String confirm(ContactForm form) {
		/**
		 * dockerでMYSQLのデータ永続化を行いMapperでDB叩く
		 */
		return "";
	}
}
