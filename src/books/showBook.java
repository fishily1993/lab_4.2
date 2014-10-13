package books;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class showBook extends ActionSupport {
	   private String ISBN;
	   private String Title;
	   private String AuthorID; 
	   private String Publisher;
	   private double Price;

	   public String execute() {
	      String ret = "error";
	      Connection conn = null; 

	      try {
	         String URL = "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_gytlab2";
	         Class.forName("com.mysql.jdbc.Driver");
	         conn = DriverManager.getConnection(URL, "y13w4xj3zo", "01klx5y4wimyh4jllh1k4mm4yyyimhkl15hi22y5");
	         String sql = "SELECT * FROM Book WHERE";
	         sql+=" Title = ?";
//	         System.out.println(Title);
	         PreparedStatement qs = conn.prepareStatement(sql);
	         qs.setString(1, Title);
	         ResultSet rs = qs.executeQuery();
	         if(rs.next()){
	        	 ISBN = rs.getString(1); 
	        	 Title = rs.getString(2);
	        	 AuthorID = rs.getString(3);
	        	 Publisher = rs.getString(4);
	        	 Price = rs.getDouble(6);
	        	 ret = "success";
	         }
	      } catch (Exception e) {
	         ret = "error"; 
	      } finally {
	         if (conn != null) {
	            try { 
	               conn.close();
	            } catch (Exception e) {
	            }
	         }
	      }
	      return "success";
	   }
	   
	   public String getISBN() {
	      return this.ISBN;
	   }
	   public void setISBN(String ISBN) {
	      this.ISBN = ISBN;
	   }
	   public String getTitle() {
		      return this.Title;
		   }
	   public void setTitle(String Title) {
		      this.Title = Title;
		   }
	   public void setAuthorID(String AuthorID) {
		   this.AuthorID  = AuthorID;
	   }
	   public String getAuthorID() {
		   return this.AuthorID;
	   }
	   public String getPublisher() {
		      return this.Publisher;
	   }
	   public void setPublisher(String Publisher) {
		      this.Publisher = Publisher;
	   }
	   public double getPrice() {
		      return this.Price;
	   }
	   public void setPrice(double Price) {
		      this.Price = Price;
	   }
	   
}