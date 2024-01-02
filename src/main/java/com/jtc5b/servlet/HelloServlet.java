package com.jtc5b.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name="random_name", urlPatterns="/form.action", loadOnStartup=1,
initParams= {@WebInitParam(name="email1", value="Hello@gmail.com")})
public class HelloServlet extends HttpServlet{
	public void init(ServletConfig sc) {
		System.out.println("init method in HelloServlet");
	}
	public void service(ServletRequest req, ServletResponse res) {
		System.out.println("service metod in HelloServlet");
	}
	public void destroy() {
		System.out.println("destroy method in HelloServlet");
	}
	
	lets make some changes to understand the branch concept.
}
