package com.virtusa.finals.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.virtusa.finals.service.CustomUserDetailsService;

//@configuration annotations which indicates that the class has @bean definition methods
@Configuration
//enablewebsecurity enables the web securities defined by websecurityconfigureradapter automatically
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	//@autowired annotations can be used to autowire bean on the setter method just like @required annotations,constructor
	@Autowired
	private DataSource dataSource;
	//@dean annotations which is applied on a method to specify that it returns  bean to be managed by spring context
	 @Bean
	 @Override
	 public UserDetailsService userDetailsService()
	 {
		 return new CustomUserDetailsService();
	 }
	//@dean annotations which is applied on a method to specify that it returns  bean to be managed by spring context
	 @Bean
	 public BCryptPasswordEncoder passwordEncoder()
	 {
		 return new BCryptPasswordEncoder();
	 }
	//@dean annotations which is applied on a method to specify that it returns  bean to be managed by spring context
	  @Bean
	  public DaoAuthenticationProvider authenticationProvider()
	  {
		  DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		  authProvider.setUserDetailsService(userDetailsService());
		  authProvider.setPasswordEncoder(passwordEncoder());
		  return authProvider;
	  }
	//@override annotation indicates that the child class method is over writing its base class method
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider());
	}
	//@override annotation indicates that the child class method is over writing its base class method
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/index").authenticated()
		.anyRequest().permitAll()
		.and()
		.formLogin()
		.usernameParameter("email")
		.defaultSuccessUrl("/index")
		.permitAll()
		.and()
		.logout().logoutSuccessUrl("/").permitAll();
	}
	  
	  
	

}
