package com.thirdgear.example.erp_api_demo;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
// @Import(CoreConfiguration.class)
@ComponentScan(basePackages = {"com.thirdgear.example.erp_api_demo.*"})
@EnableWebSecurity
public class AppConfiguration {
	@Bean
	public DataSource dataSource() {
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();

	    // dataSource.setDriverClassName("");
	    dataSource.setUsername("api");
	    dataSource.setPassword("sql");
	    dataSource.setUrl(
	      "jdbc:mysql://localhost:3306/erp"); 
	    
	    return dataSource;
	}
	
	
	protected void configure(HttpSecurity security) throws Exception
    {
     security.httpBasic().disable();
    }
	
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests().anyRequest().permitAll();
		return http.build();
	}
}
