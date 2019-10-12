package com.ilu2code.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		UserBuilder userBuilder = User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication()
		.withUser(userBuilder.username("ravindra").password("test").roles("employer"))
		.withUser(userBuilder.username("thirumala").password("test123").roles("manager"))
		.withUser(userBuilder.username("ashokreddy").password("test123").roles("admin"));
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/employees").hasRole("employer")
		.antMatchers("/leaders/**").hasRole("manager")
		.antMatchers("/systems/**").hasRole("admin")
		.and()
		.formLogin()
		.loginPage("/showloginpage")
		.loginProcessingUrl("/authenticateuser")
		.permitAll()
		.and().logout().
		logoutUrl("/").
		permitAll();
		
//		.and()
//		.formLogin()
//		.loginPage("/showloginpage")
//		.loginProcessingUrl("/authenticateuser")
//		.permitAll()
//		.and().logout()
//		.permitAll();
	}

}
