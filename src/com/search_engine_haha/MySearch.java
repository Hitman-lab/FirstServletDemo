package com.search_engine_haha;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MySearch
 */
public class MySearch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MySearch() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("type_text");
		response.sendRedirect("https://www.google.co.in/#q=" + name);
	}

}
