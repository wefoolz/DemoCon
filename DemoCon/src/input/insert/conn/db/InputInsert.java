package input.insert.conn.db;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class InputInsert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/gcek";
			String username = "root";
			String password = "";
			Connection con = DriverManager.getConnection(url, username,password);
				
			String q = "insert into table1(tName, tCity) values(?,?)";
//			String q = "insert into table1(tId, tName, tCity) values(?,?,?)";
			
			PreparedStatement st = con.prepareStatement(q);
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
//			System.out.println("Enter Id: ");
//			int id = Integer.parseInt(br.readLine());
			System.out.println("Enter name: ");
			String name = br.readLine();
			System.out.println("Enter City: ");
			String city = br.readLine();
			
//			st.setInt(1, id);
//			st.setString(2, name);
//			st.setString(3,city);
			
			st.setString(1, name);
			st.setString(2,city);
				
			st.executeUpdate();
			System.out.println("Data Inserted");
			con.close(); 	
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
