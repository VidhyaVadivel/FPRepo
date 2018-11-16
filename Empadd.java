
public class Empadd {
	
	public static void main(String args[])
	{
Employeel emp[]=new Employeel[3];
for(int i=0;i<emp.length;i++)
   emp[i]=new Employeel();

Address add[]=new Address[3];
for(int i=0;i<add.length;i++)
   add[i]=new Address();

emp[0].setEid(101);
emp[0].setEname("vaish");
emp[0].setAge(21);
emp[0].setDesignation("trainee");
emp[0].setSalary(22000);

emp[1].setEid(102);
emp[1].setEname("vidhya");
emp[1].setAge(25);
emp[1].setDesignation("manager");
emp[1].setSalary(45000);

emp[2].setEid(103);
emp[2].setEname("ashvi");
emp[2].setAge(23);
emp[2].setDesignation("teamlead");
emp[2].setSalary(32000);

add[0].setStreet("krg nagar");
add[0].setLane("ganapathy");
add[0].setDistrict("coimbatore");
add[0].setCity("coimbatorte");
add[0].setState("tamilnadu");
add[0].setCountry("india");
add[0].setPincode(641006);

add[1].setStreet("dr nagar");
add[1].setLane("vellakovil");
add[1].setDistrict("tiruppur");
add[1].setCity("tiruppur");
add[1].setState("tamilnadu");
add[1].setCountry("india");
add[1].setPincode(638111);

add[2].setStreet("bharathi nagar");
add[2].setLane("avarampalayam");
add[2].setDistrict("hosur");
add[2].setCity("hosur");
add[2].setState("tamilnadu");
add[2].setCountry("india");
add[2].setPincode(654321);


for(int i=0;i<add.length;i++)
{
	System.out.println(emp[i].toString());
emp[i].print(add[i]);
}
	}
}
