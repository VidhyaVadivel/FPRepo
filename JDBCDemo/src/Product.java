import java.sql.*;
import java.util.Scanner;
public class Product {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@orcl11g.thbs.india.com:1521:ORAC11G", "vidhya_v", "thbs123");
		System.out.println("Connected");
		Statement st = conn.createStatement();
		
		//String s1 = "create table Product(id number,name varchar2(20))";
		//st.execute(s1);
		
		
		
		String s2 = "insert into Product values(?,?)";
		PreparedStatement ps1 = conn.prepareStatement(s2);
	
		for(int i=1;i<=3;i++) {
			String name = sc.nextLine();
			ps1.setString(2,name);
			ps1.setInt(1,i);
			ps1.executeUpdate();
		}
		
		String s3 = "select *from Product";
		PreparedStatement ps2 = conn.prepareStatement(s3);
		ResultSet res = ps2.executeQuery();
		
		while(res.next()) {
			System.out.println(res.getInt(1)+"\t"+res.getString(2));
		}
	}

}
