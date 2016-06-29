package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet {
	private SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		


		System.out.println("QQ");
		System.out.println("第二次commit");
		System.out.println("第三次commit");
		System.out.println("最後一次commit");
		



		System.out.println("Servlet1");
		System.out.println("Servlet1-2");
		System.out.println("Servlet1-3");

		System.out.println("oh Servlet1");
		System.out.println("yoServlet1");
		System.out.println("zzzzzzz");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		


		HttpSession session = request.getSession();
		session.setAttribute("time", ""+sDateFormat.format(new Date()));
		
		String path = request.getContextPath();
		response.sendRedirect(path+"/success.jsp");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
