package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.Book;

public class BookDao {

	Connect connect = new Connect();
	Connection connection = connect.getCon();
	PreparedStatement preparedStatement = null;
	Statement statement = null;

	public boolean addBook(Book book) {

		int n = 0;
		try {
			preparedStatement = connection.prepareStatement(
					"insert into book(bookid,booktitle,bookreview,bookprice,bookauthor) values(?,?,?,?,?)");
			preparedStatement.setInt(1, book.getBookid());
			preparedStatement.setString(2, book.getBooktitle());
			preparedStatement.setString(3, book.getBookreview());
			preparedStatement.setFloat(4, book.getBookprice());
			preparedStatement.setString(5, book.getBookauthor());

			n = preparedStatement.executeUpdate();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		if (n != 0)
			return true;
		else
			return false;

	}

	public List<String> displayBooks() {
		List<String> list = new ArrayList<String>();

		try {
			statement = connection.prepareStatement("select distinct booktitle from book");

			ResultSet resultSet = statement.executeQuery("select distinct booktitle from book");

			while (resultSet.next()) {
				list.add(resultSet.getString("booktitle"));
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {

				connection.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return list;

	}

	public Book searchBook(String booktitle) {
		Book book = new Book();

		try {
			String query = "select bookid,booktitle,bookreview,bookprice,bookauthor from book where booktitle =?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,booktitle);
			ResultSet resultSet = preparedStatement.executeQuery();

			

				while (resultSet.next()) {
					book.setBookid(resultSet.getInt(1));
					book.setBooktitle(resultSet.getString(2));
					book.setBookreview(resultSet.getString(3));
					book.setBookprice(resultSet.getFloat(4));
					book.setBookauthor(resultSet.getString(5));
				
				
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {

				connection.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		return book;

	}

	public boolean removeBook(String booktitle)
	{
		ResultSet resultSet=null;
		int n=0;
		try {
			preparedStatement=connection.prepareStatement("delete from book where booktitle=?");
			preparedStatement.setString(1,booktitle);
			 n = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(n!=0)
			return true;
	else
		return false;
	}
	
	public boolean addreview(String booktitle,String bookreview)
	{
		int n = 0;
		try {
			preparedStatement = connection.prepareStatement(
					"update book set bookreview=? where booktitle=?");

			preparedStatement.setString(1,bookreview);
			preparedStatement.setString(2, booktitle);

			n = preparedStatement.executeUpdate();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		if (n != 0)
			return true;
		else
			return false;

		
	}
	
}
