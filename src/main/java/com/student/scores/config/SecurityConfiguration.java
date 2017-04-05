package com.student.scores.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@Profile("production")
public class SecurityConfiguration
{
	// Authentication
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.inMemoryAuthentication()
					.withUser("juanmasn")
					.password("12345")
					.roles("USER","ADMIN");
	}
	
	// Authorization
	@Configuration
	@Order(1)                                                        
	public static class ApiWebSecurityConfigurationAdapter extends WebSecurityConfigurerAdapter {
		protected void configure(HttpSecurity http) throws Exception {
			http
				.antMatcher("/api/**")                               
				.authorizeRequests()
					.anyRequest().hasRole("ADMIN")
					.and()
				.httpBasic()
				.and()
				.csrf()
				.disable();
		}
	}
	
	@Configuration   
	@Order(2)
	public static class FormLoginWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter 
	{	
		@Override
		public void configure(HttpSecurity http) throws Exception
		{
			http.antMatcher("/students/**").authorizeRequests()
						.anyRequest().hasRole("USER")
						
						.and()
						
						.formLogin().loginPage("/login.jsp")
									.failureUrl("/login.jsp?error=1")
									.loginProcessingUrl("/login")
									.permitAll()
									.and()
									.logout()
									.logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login.jsp")
									.permitAll()
									.logoutSuccessUrl("/scores/list.html");
			
			http.antMatcher("/public/**").authorizeRequests()
						.anyRequest()
						.permitAll();
		}
	}
}
