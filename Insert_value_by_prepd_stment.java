import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
public class Insert_value_by_prepd_stment {
	
	public static void main(String[] args) 	throws Exception
	{
		Scanner obj=new Scanner(System.in);

		String url="jdbc:mysql://localhost:3306/abc";
		String uname="root";
		String pass="input your mysql password";
		System.out.println("enter string");
		String name=obj.nextLine();
		System.out.println("enter id");
		int id=obj.nextInt();
//		integer ke baad string ko skip kr  raha hai why?
//		System.out.println("enter string");
//		String name=obj.nextLine();
		String Query="insert into pet1 values (?,?)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection(url, uname, pass);
		PreparedStatement st=cn.prepareStatement(Query);
		st.setLong(1, id);
		st.setString(2, name);
		
		int count=st.executeUpdate();
		System.out.println(count +"row affected");
		
		st.close();
		cn.close();
		obj.close();
	}

}


	
