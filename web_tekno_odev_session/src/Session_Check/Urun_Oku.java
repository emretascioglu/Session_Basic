package Session_Check;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Urun_Oku")
public class Urun_Oku extends HttpServlet { 
	public void doGet (HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();	
		String title = "Sipariþ Listesi";
		String docType =
				"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
						"Transitional//EN\">\n";
		out.println(docType +
				"<HTML>\n" +
				"<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
				"<BODY BGCOLOR=\"#FDF5E6\">\n" +
				"<H1> <center> " + title + " </center> </H1>"+
				"<form action=\"/web_tekno_odev_session/Urun_Oku\" method=\"post\">"+
				"<center><b>Yeni Ürün Giriniz</b>: </center> "+
				"<center><input type=\"text\" name=\"isim\"><br> </center>"+
				"<center><input type=\"submit\"/><center>"+    
				"<center><a href='/web_tekno_odev_session/Urun_Giris'>Alis_Verisi Bitir!</a></center>"+       
				"</form>"
				);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String isim =request.getParameter("isim");
		session.setAttribute(isim, isim);
		doGet(request, response);
	}}
