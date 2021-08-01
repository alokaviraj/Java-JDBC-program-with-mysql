import java.sql.*;
public class Insert_in_database_from_eclipse {
	
	public static void main(String[] args) 	throws Exception
	{

		String url="jdbc:mysql://localhost:3306/abc";
		String uname="root";
		String pass="input your mysql password";
		String Query="insert into pet1 values (4,'mona')";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection(url, uname, pass);
		Statement st=cn.createStatement();
		int count=st.executeUpdate(Query);
		System.out.println(count +"row affected");
		
		st.close();
		cn.close();
	}

}
