package com.example.hoge.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.hoge.form.ContactForm;

@Mapper
public class ContactMapper {
	public ContactForm contactMapper(@Param("contactForm") ContactForm contactForm);
}
