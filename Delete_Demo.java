import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete_Demo {

	public static void main(String[] args)throws Exception {
		String Email1="john987@gmail.com";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost: 3306/student_table","root","Deepa07**..");
		
		PreparedStatement ps= con.prepareStatement("delete from student where email=? ");
		ps.setString(1, Email1);
		int count =ps.executeUpdate();
		
		if(count> 0)
		{
			System.out.println("Suucess");
		}
		else
		{
			System.out.println("failed");
		}
	}

}
