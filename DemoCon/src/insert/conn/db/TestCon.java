package insert.conn.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/gcek";
			String username = "root";
			String password = "";
			Connection con = DriverManager.getConnection(url, username,password);
			
			String q = "insert into table1(tName, tCity) values(?,?)";
			
			PreparedStatement st = con.prepareStatement(q);
			
			st.setString(1, "Pranav");
			st.setString(2, "Kolhapur");
			
			st.executeUpdate();
			System.out.println("Data Inserted");
			con.close(); 	
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
