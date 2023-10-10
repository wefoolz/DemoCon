package update.conn.table.db;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateTable {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/gcek";
			String username="root";
			String password = "";
			Connection con = DriverManager.getConnection(url,username,password);
			String sql = "update table1 set tName= ?, tCity=? where tId=?";
			PreparedStatement st = con.prepareStatement(sql);
			
			BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter Name: ");
			String name = bs.readLine();
			System.out.println("Enter City: ");
			String city = bs.readLine();
			
			System.out.println("Enter the student id: ");
//			int id = bs.read();
			int id =Integer.parseInt(bs.readLine());
			System.out.println(id+" "+name+" "+city);
			st.setString(1, name);
			st.setString(2, city);
			st.setInt(3, id);
			st.executeUpdate();
			System.out.println("Done.....");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
