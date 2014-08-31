package com.nekoscape.rest.sample.filter;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.Provider;

@Provider
public class ContainerFilter implements ContainerRequestFilter,
		ContainerResponseFilter {
	@Context
	HttpServletRequest webRequest;

	@Override
	public void filter(ContainerRequestContext requestContext,
			ContainerResponseContext responseContext) throws IOException {

		if (webRequest != null) {
			System.out.println(webRequest.getSession().getId());
		}
		System.out.println("request filter");
	}

	@Override
	public void filter(ContainerRequestContext requestContext)
			throws IOException {

		if (webRequest != null) {
			System.out.println(webRequest.getSession().getId());
		}
		System.out.println("response filter");
	}
}
