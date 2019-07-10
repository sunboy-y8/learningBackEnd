package com.example.demo.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MyPasswordEncoder extends BCryptPasswordEncoder {
	@Override
	public String encode(CharSequence rawPassword) {
		return rawPassword.toString();
	}
	
	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		return rawPassword.equals(encodedPassword);
	}
	
}
