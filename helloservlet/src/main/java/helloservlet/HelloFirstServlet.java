package helloservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloFirstServlet extends HttpServlet {
	@Override
	protected void  doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
			 PrintWriter out = resp.getWriter();
			 out.write("Servet 3 web.xml example configuration");
		}
	}

