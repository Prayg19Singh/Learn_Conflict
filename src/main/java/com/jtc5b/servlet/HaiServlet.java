package com.jtc5b.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name="any_random-name", urlPatterns="/form_action", 
loadOnStartup=2, 
initParams= {@WebInitParam(name="email2", value="Hai@gmail.com")})
public class HaiServlet extends HttpServlet {
	public void init(ServletConfig sc) {
		System.out.println("init method in HaiServlet");
	}
	public void service(ServletRequest req, ServletResponse res) {
		System.out.println("service method in HaiServlet");
	}
	line 20--> changes have done from Central repo by other developer
	public void destroy() {
		System.out.println("destroy method in HaiServlet");
	}
}
