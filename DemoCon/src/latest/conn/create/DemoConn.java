package latest.conn.create;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DemoConn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/gcek";
			String username = "root";
			String password = "";
			Connection con = DriverManager.getConnection(url,username,password);
			
//			String sqry = "create table table1 (tId int(20) primary key auto_increment, tName varchar(20) not null, tCity varchar(20))";
			String sqry = "create table image(Id int(20) primary key auto_increment, img blob)";
			Statement st = con.createStatement();
			st.executeUpdate(sqry);
			System.out.println("table create");
			
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
