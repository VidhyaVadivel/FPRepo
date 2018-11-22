package Ass1;

public class Employee {
	int empId;
	String empName;
	String designation;
	double basic;
	double hra;
	double salary;
	Employee()
	{}
	public double getSalary() {
		return salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getHra() {
		return hra;
	}
	
	public Employee(int empId, String empName, String designation, double basic) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.basic = basic;
	}
	
	static double CalculateHRA(String desig, double basic) {
		double hra=0;
		
			if(desig == "Manager") 
				hra=0.1*basic;
	
			if(desig == "Officer") 
				hra= (0.12*basic);
	
			if(desig == "Clerk") 
				hra= (0.05*basic);

			return hra;
			
		}

	void PrintDet() {
		System.out.println("EmpId:"+empId+"\tEmpName:"+empName+"\t\tDesignation:"+designation+"\tBasic:"+basic+"\tHRA:"+hra);
	}
	String arr[] = new String[4];
	//double sal=new double[4];

	void Emp_Desig(Employee emp[])
	{ 
		
		for(int i=0;i<emp.length;i++) {
			arr[i]=emp[i].getDesignation();
		}
		for(int i=0;i<4;i++) {
			
			for(int j=i+1;j<4;j++)
			{
				if((arr[i]==arr[j])&&(arr[i]!=null)) 
					arr[j]=null;
			}
		}
		
		
		for(int i=0;i<4;i++) {
		
			if(arr[i]!=null) {
				
				System.out.println("----"+arr[i]+"----");
				for(int j=0;j<4;j++)
				{
					if(arr[i] == emp[j].getDesignation())
						System.out.println(emp[j].getEmpName());
				}
			}
		
		}
		
	}
	
	void Emp_Sal(Employee emp[]) {
		
		for(int i=0;i<emp.length;i++) {
			emp[i].salary=(emp[i].getBasic()+emp[i].getHra());
		}
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i].empName+"\t"+emp[i].salary);
		}
	}
}
	
	

