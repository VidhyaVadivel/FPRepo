
public class EmployeeAddress {
	int eid=10001;
	String ename="Vidhya";
	int age=24;
	String desg="Engineer";
	int salary=25000;
	
	
	
	public void printEmployeeDetails(AddressEmployee aemp)
	{
		System.out.println("Eid:"+eid+"  Ename:"+ename+"  Age:"+age+"  Designation:"+desg+"  Salary:"+salary);
		System.out.println(aemp.toString());
	}
	
	//AddressEmployee aemp;
	
	public static void main(String[] args) {
		EmployeeAddress emp = new EmployeeAddress();
		
		AddressEmployee emp2 = new AddressEmployee();
		emp2.setStreet("gandhi nagar");
		emp2.setCity("Trichy");
		emp2.setCountry("India");
		emp2.setLane("vellakovil");
		emp2.setDistrict("Trichy");
		emp2.setState("TamilNadu");
		emp2.setPincode(123);
		emp.printEmployeeDetails(emp2);
		
	}
}
