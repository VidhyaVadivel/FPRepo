
public class EmployeeDetails {

	public static void main(String[] args) {
	Employee emp[]=new Employee[10];
	String emp1[]=new String[10];
	//int k=1;
	for(int i=0;i<emp.length;i++)
		emp[i]=new Employee();
	emp[0].setEid(101);
	emp[0].setEname("vaish");
	emp[0].setSalary(20000);
	emp[0].setDesignation("trainee");	
	
	emp[1].setEid(102);
	emp[1].setEname("vidhya");
	emp[1].setSalary(24000);
	emp[1].setDesignation("trainee");
	
	emp[2].setEid(103);
	emp[2].setEname("ashvi");
	emp[2].setSalary(21000);
	emp[2].setDesignation("manager");
	
	emp[3].setEid(104);
	emp[3].setEname("malar");
	emp[3].setSalary(27500);
	emp[3].setDesignation("tester");
	
	emp[4].setEid(105);
	emp[4].setEname("kavi");
	emp[4].setSalary(30000);
	emp[4].setDesignation("engineer");
	
	emp[5].setEid(106);
	emp[5].setEname("sneh");
	emp[5].setSalary(25000);
	emp[5].setDesignation("manager");
	
	emp[6].setEid(107);
	emp[6].setEname("sreega");
	emp[6].setSalary(19000);
	emp[6].setDesignation("trainee");
	
	emp[7].setEid(108);
	emp[7].setEname("nithya");
	emp[7].setSalary(45000);
	emp[7].setDesignation("team lead");
	
	emp[8].setEid(109);
	emp[8].setEname("harini");
	emp[8].setSalary(22000);
	emp[8].setDesignation("tester");
	
	emp[9].setEid(110);
	emp[9].setEname("yogin");
	emp[9].setSalary(40000);
	emp[9].setDesignation("team lead");
	for(int i=0;i<emp.length;i++)
	{
	emp[i].print();
	}
	System.out.println("updated salary:");
	for(int i=0;i<emp.length;i++)
		emp[i].update();
	for(int i=0;i<emp.length;i++)
		emp1[i]=emp[i].getDesignation();
	

	for(int i=0;i<emp.length;i++)
	{
		for(int j=i+1;j<emp.length;j++)
		{
			if(emp1[i]==emp1[j]&& emp1[j]!=null)
			emp1[j]=null;
		}
		
	}
	for(int i=0;i<emp1.length;i++)
	{
		if(emp1[i]!=null)
			{
			System.out.println("-----"+emp1[i]+"----");
		for(int j=0;j<emp.length;j++)
		{
		if(emp1[i]==emp[j].getDesignation())
		{
			System.out.println(emp[j].getEname());
		}
		}
			}
	}


	
	
	
	
	
	
	

	}

}
