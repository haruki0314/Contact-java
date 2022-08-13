package com.example.hoge.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ContactForm {
	/**
	 * 名字
	 */
	@NotEmpty(message = "名字を入力してください")
    @Size(max = 100, message = "名字は100桁以内で入力してください")
	public String firstName;
	/**
	 * 名前
	 */
	@NotEmpty(message = "名前を入力してください")
    @Size(max = 100, message = "名前は100桁以内で入力してください")
	public String lastName;
	/**
	 * メールアドレス
	 */
	@NotNull
	@Pattern(regexp = "[\\w\\-._]+@[\\w\\-._]+\\.[A-Za-z]+", message = "メールアドレスを正しい形式で入力して下さい")
	public String mail;
	/**
	 * 
	 */
	@Pattern(regexp = "0\\d{1,4}-\\d{1,4}-\\d{4}", message = "電話番号の形式で入力してください")
	public String phoneNumber;
	/**
	 * お問合せ内容
	 */
	@NotNull
	public String info;
}
