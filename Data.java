import java.sql.*;

public class Data {
	public static void main(String[] args) 
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/studentdata";
		String username = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, username, password);
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery("SELECT CUSTOMER_NAME FROM CUSTOMER WHERE CUSTOMER_ID ='40'");
		
		rs.next();
		{ 
		String std=rs.getString("CUSTOMER_NAME");
		System.out.println(std);
		}
		st.close();
		con.close(); 
		rs.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("executed");
		
		
		
	}
}
