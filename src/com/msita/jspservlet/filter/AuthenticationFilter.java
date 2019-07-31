/**
 * 
 */
package com.msita.jspservlet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author thongnguyen
 *
 */

@WebFilter({"/home", "/bookList","/createBook","/deleteBook","/updateBook","/searchBook","/logout"})
public class AuthenticationFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpReq = (HttpServletRequest) request;
		HttpSession session = httpReq.getSession(false);
		if (session == null) {
			System.out.println("null");
			RequestDispatcher dispatcher = httpReq.getServletContext().getRequestDispatcher("/WEB-INF/views/login.jsp");
	        dispatcher.forward(request, response);
		} else {
			System.out.println("not null");
			chain.doFilter(request,response); 
		}
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	} 
	
	public void destroy() {}
}
