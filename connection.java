import java.sql.*;

public class connection {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:33065/cdac", "root", "cdac");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));			
			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}		
	}
}