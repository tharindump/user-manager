/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.spring.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServletApplication extends SpringBootServletInitializer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ServletApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ServletApplication.class);
	}
	
	/*
	 * Servlet mapping configurations for RestEasy Servlet
	 * This Method will map the Servlet configurations that used instead of the web.xml
	 * 
	 * @return 
	 * 
	 */
	/*
	
	@Bean
	public ServletRegistrationBean dispatcherServletRegistration() {
		ServletRegistrationBean registrationBean = 
				new ServletRegistrationBean(new HttpServletDispatcher(), "/api/*");
		
		registrationBean.addInitParameter("javax.ws.rs.Application", "com.example.spring.rest.resteasy.ResteasyApplication");
		
		return registrationBean;
		
	}
	
	
	@Bean
	public ServletRegistrationBean helloServletRegistration() {
		ServletRegistrationBean registrationBean = 
				new ServletRegistrationBean(new HttpServletDispatcher(), "/message");
		
		registrationBean.addInitParameter("message", "Hello World");
		
		return registrationBean;
	}

	*/
	

}
