import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ResultSet_Demo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_table","root","Deepa07**..");
		
		PreparedStatement ps= con.prepareStatement("select*from student");
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			/*
			System.out.println("ID : "+rs.getInt("ID"));
			System.out.println("Name : "+rs.getString("Name"));
			System.out.println("Email : "+rs.getString("Email"));
			System.out.println("City : "+rs.getString("City"));
			*/
			int ID1=rs.getInt("ID");
			System.out.println(ID1);
			
			String name1=rs.getString("Name");
			System.out.println(name1);
			
			String email1=rs.getString("Email");
			System.out.println(email1);
			
			String City1=rs.getString("City");
			System.out.println(City1);
			
			System.out.println("------------------------------");
		}
	}

}
