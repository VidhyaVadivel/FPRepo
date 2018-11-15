
public class Demo {

	public static void main(String[] args) {
		
		Employee emp[] = new Employee[5];
		for(int i=0;i<5;i++)
			emp[i]=new Employee();
	
		emp[0].setEmpid(1001);
		emp[0].setEname("Vidhya");
		emp[0].setDesg("Engineer");
		emp[0].setPhno(1234567891);
		emp[0].setEmail("vidhya@gmail.com");
		emp[0].setSal(50000.00f);
		
		emp[1].setEmpid(1002);
		emp[1].setEname("Asvitha");
		emp[1].setDesg("Engineer");
		emp[1].setPhno(1987654321);
		emp[1].setEmail("asvitha@gmail.com");
		emp[1].setSal(25000.00f);
		
		emp[2].setEmpid(1003);
		emp[2].setEname("Vaishahi");
		emp[2].setDesg("Trainee");
		emp[2].setPhno(1568956341);
		emp[2].setEmail("vaishahi@gmail.com");
		emp[2].setSal(23000.00f);
		
		emp[3].setEmpid(1004);
		emp[3].setEname("Priya");
		emp[3].setDesg("Tester");
		emp[3].setPhno(188966341);
		emp[3].setEmail("priya@gmail.com");
		emp[3].setSal(35000.00f);
		
		emp[4].setEmpid(1005);
		emp[4].setEname("Gowri");
		emp[4].setDesg("Trainee");
		emp[4].setPhno(1568956341);
		emp[4].setEmail("gowri@gmail.com");
		emp[4].setSal(30000.00f);
		
		for(int i=0;i<emp.length;i++) {
			emp[i].printDetails();
			System.out.println("********************************");
		
		}
		for(int i=0;i<emp.length;i++) {
			emp[i].updateDetails();
		}
		
		for(int i=0;i<emp.length;i++) {
			System.out.println("----"+emp[i].getDesg()+"----");
			for(int j=i;j<emp.length;j++)
			{
				if(emp[i].getDesg()==emp[j].getDesg())
					System.out.println(emp[i].getEname());
			}
		}
	}

}
