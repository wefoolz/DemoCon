package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlCon {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/gcek";
		String username = "root";
		String password = "";
		String sqlqry = "Select * from nav_bar";
		Connection con = DriverManager.getConnection(url,username,password);
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(sqlqry);
		rs.next();
		System.out.println(rs.getString("Main_menu"));
		
	}

}

//
//
//		
//		Connection con = DriverManager.getConnection(url,username,password);
//		
//		Statement st = con.createStatement();
//		
//		ResultSet rs =  st.executeQuery(query);
//		rs.next();
//		System.out.println(rs.getString("menu_id")+" "+rs.getString("Main_menu")+" "+rs.getString("links"));
//		rs.next();
//		System.out.println(rs.getString("menu_id")+" "+rs.getString("Main_menu")+" "+rs.getString("links"));
//		rs.next();
//		System.out.println(rs.getString("menu_id")+" "+rs.getString("Main_menu")+" "+rs.getString("links"));
//		con.close();
//		
//	}
//
//}
