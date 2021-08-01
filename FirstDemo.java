import java.sql.*;

//import com.mysql.cj.protocol.Resultset;
import java.sql.DriverManager;
//import com.sun.jdi.connect.spi.Connection;


public class FirstDemo {

	public static void main(String[] args) throws Exception 
	{
		
		String url="jdbc:mysql://localhost:3306/abc";
		String uname="root";
		String pw="input your mysql password";
//		String Query ="select name from pet where roll=1";
		String Query ="select * from pet1";
		
		
		
//		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, uname, pw);
//		Connection is an interface so we use a DriverManager class here and getconnection.bcoz we can`t call interface object direct
//		getconnection is a static method and it returns connection
		
		Statement st=con.createStatement();
		ResultSet rs=  st.executeQuery(Query);
		
	    while(rs.next()) {
	    String xname =rs.getInt(1)+" "+rs.getString(2);
		System.out.println(xname);
	    }
	    
/*	    rs.next();
		    String xname =rs.getInt(2)+" "+rs.getString(1)+" "+rs.getString(3);
			System.out.println(xname);*/
		st.close();
		con.close();
	
	}

}
