package com.clientes.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ClienteSecurity {
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http)  {
		SecurityFilterChain security = null;
		try {
			
			//IgnoRA LA CONSOLA
			http.authorizeRequests().antMatchers("/h2-console/**").permitAll()
	        .and().csrf().ignoringAntMatchers("/h2-console/**")
	        .and().headers().frameOptions().sameOrigin();
			
			security = http.cors().and().csrf().disable().authorizeRequests().antMatchers("/**")
					.permitAll().anyRequest().
					authenticated().and().httpBasic().and().sessionManagement().
					sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
					.build();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return security;
				
	}
	@Bean
	UserDetailsService userDetailService() {
		InMemoryUserDetailsManager memory = new InMemoryUserDetailsManager();
		memory.createUser(User.withUsername("admin").password(encoder().encode("admin")).roles().build());
		return memory;
	}
	
	@Bean
	PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	AuthenticationManager authManager(HttpSecurity http){
		AuthenticationManager security = null; 
		try {
			security =  http.getSharedObject(AuthenticationManagerBuilder.class).
					userDetailsService(userDetailService()).passwordEncoder(encoder())
					.and().build();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return security;
	}

}
