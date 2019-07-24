package com.msita.jspservlet.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.msita.jspservlet.bo.Book;
import com.msita.jspservlet.dao.BookDAO;

/**
 * Servlet implementation class CreateBookServlet
 */
@WebServlet(urlPatterns = {"/createBook"})
public class CreateBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/createbook.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String name = (String) request.getParameter("name");
	     String author = (String) request.getParameter("author");
	     String publisher = (String) request.getParameter("publisher");
	     String priceStr = (String) request.getParameter("price");
	     int price = Integer.parseInt(priceStr);
	     
	     Book newBook = new Book();
	     newBook.setName(name);
	     newBook.setAuthor(author);
	     newBook.setPublisher(publisher);
	     newBook.setPrice(price);
	     
	     BookDAO bookDAO = new BookDAO();
	     bookDAO.insertBook(newBook);
	     
	     response.sendRedirect(request.getContextPath() + "/bookList");
	}

}
