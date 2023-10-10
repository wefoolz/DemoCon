package select.conn.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/gcek";
			String username = "root";
			String password = "";
			Connection con = DriverManager.getConnection(url,username,password);
			
			String select = "Select * from table1";
			
			Statement st = con.createStatement();
			
			ResultSet set =  st.executeQuery(select);
			set.next();
//			System.out.println("in syso");
			System.out.println("id: "+set.getInt("tId")+" Name: "+set.getString("tName")+" City:"+set.getString("tCity"));
			set.next();
			System.out.println("id: "+set.getInt("tId")+" Name: "+set.getString("tName")+" City:"+set.getString("tCity"));
			set.next();
//			System.out.println("in var");
			int id = set.getInt(1);
			String city = set.getString("tCity");
			String name = set.getString(2);
			System.out.println("id: "+id+" Name: "+name+" City:"+city);
//			System.out.println("in while");
			while(set.next()) {
				System.out.println("id: "+set.getInt("tId")+" Name: "+set.getString("tName")+" City:"+set.getString("tCity"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}

}
