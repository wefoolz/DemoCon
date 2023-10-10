package img.conn.upload.db;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ImageUploader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/gcek";
			String username = "root";
			String password = "";
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			String sql = "insert into image(img) value(?)";
			
			PreparedStatement st = con.prepareStatement(sql);
			
			FileInputStream fis = new FileInputStream("E:\\laptop\\Programs\\java\\javaEclipseWindows\\DemoCon\\src\\img\\conn\\upload\\db\\demoImage.png ");
			
			st.setBinaryStream(1,fis, fis.available());
			st.executeUpdate();
			System.out.println("Uploaded");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
