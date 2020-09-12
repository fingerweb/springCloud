package com.erp.basis.all.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns="/*", asyncSupported=true)
public class AGlobalFilter implements Filter{
	
	public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException{
		String url = ((HttpServletRequest)request).getRequestURL().toString();
		
		chain.doFilter(request, response);
	}

}
