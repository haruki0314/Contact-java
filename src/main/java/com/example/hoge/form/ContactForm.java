package com.example.hoge.form;

import lombok.Data;

@Data
public class ContactForm {
	/**
	 * お問合せして来た人の名前
	 */
	public String name;
	/**
	 * メールアドレス
	 */
	public String mail;
	/**
	 * お問合せ内容
	 */
	public String info;
}
