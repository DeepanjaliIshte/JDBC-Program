import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert_JDBC {

	public static void main(String[] args)  throws Exception {
		//--------USer values--------
		int ID1=104;
		String Name1="Tom";
		String Email1="tom657@gmail.com";
		String City1="Delhi";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student_table", "root", "Deepa07**..");
		//PreparedStatement ps=con.prepareStatement("insert into student values('101','Bob','bob123@gmail.com','Pune') ");
		//PreparedStatement ps=con.prepareStatement("insert into student values('"+ID1+"','"+Name1+"','"+Email1+"','"+City1+"')");
		PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");
		ps.setInt(1, ID1);
		ps.setString(2,Name1);
		ps.setString(3,Email1);
		ps.setString(4, City1);
		
		int i = ps.executeUpdate();
		if(i>0)
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
