import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update_Demo {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		String City1="Mumbai";
		String Email1="tom657@gmail.com";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root" , "Deepa07**..");
	
		PreparedStatement ps= con.prepareStatement("Update student set city=? where email=?");
		ps.setString(1, City1);
		ps.setString(2, Email1);
		
		int count =ps.executeUpdate();
		
		if(count> 0)
		{
			System.out.println("Suucess");
		}
		else
		{
			System.out.println("failed");
		}
		con.close();
	}
}
