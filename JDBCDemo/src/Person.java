import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Person {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@orcl11g.thbs.india.com:1521:ORAC11G", "vidhya_v", "thbs123");
		System.out.println("Connected");
		Statement st = conn.createStatement();
		
	/*	String s1 = "create table Person(name varchar2(15),location varchar2(20))";
		st.execute(s1);
		*/
		String name = sc.nextLine();
		String location = sc.nextLine();
		
		String s2 = "insert into Person values('"+name+"','"+location+"')";
		st.executeUpdate(s2);
		
		String s3 = "select *from Person";
		ResultSet res = st.executeQuery(s3);
		while(res.next()) {
			System.out.println(res.getString(1)+"\t"+res.getString(2));
		}
	}

}
