package com.example.web_app_demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.servlet.ServletException;


public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		LoginServlet loginServlet = new LoginServlet();
        try {
            loginServlet.init();
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
        return application.sources(WebAppDemoApplication.class);
	}

}
