package th.ac.ku.kps.eng.cpe.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloFirstServlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException {
			PrintWriter out = resp.getWriter();
			out.write("Hello world");

		}
}
