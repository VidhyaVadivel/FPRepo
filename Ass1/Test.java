package Ass1;

public class Test {

	public static void main(String[] args) {
		Employee emp[] = new Employee[4];
	   Employee empl=new Employee();
			emp[0] = new Employee(101,"Vidhya","Manager",20000);
			emp[1] = new Employee(102,"Vaish","Manager",30000);
			emp[2] = new Employee(103,"Asvitha","Officer",40000);
			emp[3] = new Employee(104,"Kavuri","Clerk",25000);
			
			
		
		for(int i = 0;i <emp.length;i++)
		{
			emp[i].hra=Employee.CalculateHRA(emp[i].designation,emp[i].basic);
			emp[i].salary = emp[i].hra+emp[i].basic;
		}
		for(int i = 0;i <emp.length;i++) {
			emp[i].PrintDet();
		}
		System.out.println("*****************************");
		empl.Emp_Desig(emp);
		System.out.println("*****************************");
		empl.Emp_Sal(emp);
	
}
}
