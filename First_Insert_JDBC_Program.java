import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class First_Insert_JDBC_Program 
{
	public static void main(String[] args)throws Exception 
	{
		/*
		String name1="Sia";
		String email1="sia123@gmail.com";
		String pass1="si@123";
		String gender1="Female";
		String city1="Delhi"; */
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root","Deepa07**.." );
		PreparedStatement ps=con.prepareStatement("insert into register values ('john','john123@gmail.com','john.','male','pune')") ;
		int i=ps.executeUpdate();
		
		if(i>0)
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("fail");
		}
	}

}

