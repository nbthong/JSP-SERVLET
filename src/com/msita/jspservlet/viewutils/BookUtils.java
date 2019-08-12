package com.msita.jspservlet.viewutils;

import java.util.ArrayList;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.apache.tomcat.util.codec.binary.Base64;

import com.msita.jspservlet.bo.Book;
import com.msita.jspservlet.viewbo.BookView;


public class BookUtils {
	
	
	public static ArrayList<BookView> convertToBookViewList(ArrayList<Book> bookList){
		
		ArrayList<BookView> bookViewList = new ArrayList<BookView>();
		for (Book book : bookList) {
			bookViewList.add(convertToBookView(book));
			
		}
		return bookViewList;
	}
	
	public static BookView convertToBookView(Book book){
		BookView bookView = new BookView();
		bookView.setId(book.getId());	
		bookView.setName(book.getName());		
		bookView.setAuthor(book.getAuthor());		
		bookView.setPublisher(book.getPublisher());	
		bookView.setPrice(book.getPrice());
		String photoEncode=Base64.encodeBase64String(book.getPhoto());
		bookView.setPhoto(photoEncode);
		return bookView;
	}
	
}
