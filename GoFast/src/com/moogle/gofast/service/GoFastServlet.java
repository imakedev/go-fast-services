package com.moogle.gofast.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class GoFastServlet extends HttpServlet {
	 /**
	 * @see HttpServlet#doProCess(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doProCess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doProCess");
		System.out.println("type="+request.getParameter("type"));
		PrintWriter out = response.getWriter();
        out.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        out.write("<smsgw_response>");
        out.write("<status>ok</status>");
        out.write("<transid>Aoe2</transid>");
        out.write("</smsgw_response>");
        out.close();
        out.flush();
	}
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		/*resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");*/
		try {
			doProCess(req,resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
