package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

@Service
public class MyUserDetailService implements UserDetailsService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		  User userInfo = userMapper.getUserByName(username); 
		  return new org.springframework.security.core.userdetails.User(
				  userInfo.getUserName(),
				  userInfo.getUserPwd(),
				  AuthorityUtils.commaSeparatedStringToAuthorityList(userInfo.getRole()));
		 
		/*
		 * Collection<GrantedAuthority> authorities = new ArrayList<>();
		 * authorities.add(new SimpleGrantedAuthority("ADMIN")); return new User("root",
		 * new BCryptPasswordEncoder().encode("root"), authorities);
		 */
	}

}
