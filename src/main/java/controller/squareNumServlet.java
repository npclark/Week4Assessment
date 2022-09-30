package controller;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.squaredNumber;

/**
 * Servlet implementation class squareNumServlet
 */
@WebServlet("/squareNumServlet")
public class squareNumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public squareNumServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userNum = request.getParameter("userNum");
		
		squaredNumber input = new squaredNumber(Double.parseDouble(userNum));
		
		request.setAttribute("userNumber", input);
		getServletContext().getRequestDispatcher("/squaredResult.jsp").forward(request, response);
		
//		PrintWriter writer = response.getWriter();
//		writer.println(input.toString());
//		writer.close();
	}

}
