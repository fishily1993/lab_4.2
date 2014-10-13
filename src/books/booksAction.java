package books;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class booksAction extends ActionSupport {

	   private String Name;
	   private String AuthorID; 
	   private List<String> al = new ArrayList<String>();

	   public String execute() {
	      String ret = "error";
	      Connection conn = null; 

	      try {
	         String URL = "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_gytlab2";
	         Class.forName("com.mysql.jdbc.Driver");
	         conn = DriverManager.getConnection(URL, "y13w4xj3zo", "01klx5y4wimyh4jllh1k4mm4yyyimhkl15hi22y5");
	         String sql_temp = "SELECT AuthorID FROM Author WHERE";
	         sql_temp+=" Name = ?";
//	         System.out.println(Name); //
	         PreparedStatement qs = conn.prepareStatement(sql_temp);
	         qs.setString(1, Name);
//	         System.out.println(qs.toString()); //
	         ResultSet rs_temp = qs.executeQuery();
	         while(rs_temp.next()){
	        	 AuthorID = rs_temp.getString(1); 
//	        	 System.out.println(AuthorID);
	         }
	         String sql = "SELECT title FROM book WHERE";
	         sql+=" AuthorID = ?";
	         
	         PreparedStatement ps = conn.prepareStatement(sql);
	         ps.setString(1, AuthorID);
//	         System.out.println(ps.toString()); //
	         ResultSet rs = ps.executeQuery(); 
	         while (rs.next()) {
	            al.add(rs.getString(1));
	            System.out.println(rs.getString(1));
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
	   
	   public String getName() {
	      return this.Name;
	   }
	   public void setName(String Name) {
	      this.Name = Name;
	   }
	   public List<String> getAl() {
		   return this.al;
	   }
	   public void setAl(List<String> al) {
		   this.al = al;
	   }
	   public void setAuthorID(String AuthorID) {
		   this.AuthorID  = AuthorID;
	   }
	   public String getAuthorID() {
		   return this.AuthorID;
	   }
}