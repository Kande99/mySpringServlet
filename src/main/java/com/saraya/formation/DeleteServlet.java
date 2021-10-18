
package com.saraya.formation;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.model.Formation;
import com.saraya.service.FormationService;

@WebServlet(urlPatterns = "/delete.do")
public class DeleteServlet extends HttpServlet {
	FormationService fs = new FormationService();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String nom = request.getParameter("formation");
		fs.deleteFormation(new Formation(nom));
		response.sendRedirect("/formation.do");
	}
	
	

}