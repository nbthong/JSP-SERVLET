package com.msita.jspservlet.servlet;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.msita.jspservlet.bo.Book;
import com.msita.jspservlet.dao.BookDAO;

/**
 * Servlet implementation class CreateBookServlet
 */
@WebServlet(urlPatterns = {"/createBook"})
@MultipartConfig(maxFileSize = 16177215)    // upload file's size up to 16MB
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
	     InputStream inputStream = null;// input stream of the upload file
	     // obtains the upload file part in this multipart request
	     Part filePart = request.getPart("photo");
	     if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());

            //obtains input stream of the upload file
            //the InputStream will point to a stream that contains
            //the contents of the file
            inputStream = filePart.getInputStream();
         }
	     Book newBook = new Book();
	     newBook.setName(name);
	     newBook.setAuthor(author);
	     newBook.setPublisher(publisher);
	     newBook.setPrice(price);
	     newBook.setPhoto(readFile(inputStream));
	     BookDAO bookDAO = new BookDAO();
	     bookDAO.insertBook(newBook);
	     
	     response.sendRedirect(request.getContextPath() + "/bookList");
	}
	
	private static byte[] readFile(InputStream inputStream) {
		ByteArrayOutputStream bos = null;
		try {
			byte[] buffer = new byte[1024];
			bos = new ByteArrayOutputStream();
			for (int len; (len = inputStream.read(buffer)) != -1;) {
                bos.write(buffer, 0, len);
            }
			
		} catch (Exception e) {
            System.err.println(e.getMessage());
        }
		return bos.toByteArray();
	}

}
