package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class MyWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserDetailsService MyUserDetailService;
	
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new MyPasswordEncoder();
    }
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(MyUserDetailService).passwordEncoder(passwordEncoder());
	}
	
	
	  @Override public void configure(WebSecurity web) throws Exception {
	  web.ignoring().antMatchers("/css/**","/img/**","/js/**"); }
	 
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http.formLogin()                                // 定义当需要用户登录时候，转到的登录页面。
	        .loginPage("/login")                        // 设置登录页面
	        .loginProcessingUrl("/user/login")          // 自定义的登录接口
	        .defaultSuccessUrl("/home").permitAll()     // 登录成功之后，默认跳转的页面
	        .and().authorizeRequests()                  // 定义哪些URL需要被保护、哪些不需要被保护
	        .antMatchers("/", "/index","/user/login").permitAll()       // 设置所有人都可以访问登录页面
	        .anyRequest().authenticated()               // 任何请求,登录后可以访问
	        .and().csrf().disable();                    // 关闭csrf防护
	}
	
	
}
