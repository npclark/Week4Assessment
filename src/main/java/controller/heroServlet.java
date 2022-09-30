package controller;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.heroCreation;

/**
 * Servlet implementation class heroServlet
 */
@WebServlet("/heroServlet")
public class heroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public heroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		
		heroCreation hero = new heroCreation(userName);
		
		request.setAttribute("userHero", hero);
		getServletContext().getRequestDispatcher("/heroResult.jsp").forward(request, response);
		
//		PrintWriter writer = response.getWriter();
//		writer.println(hero.toString());
//		writer.close();
	}

}
