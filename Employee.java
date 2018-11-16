
public class Employee {
private int eid;
private String ename;
private double salary;
private String designation;

public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}

public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}

public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}

public void print()
{
	System.out.println("Eid:"+eid);
	System.out.println("Ename:"+ename);
	System.out.println("Salary:"+salary);
	System.out.println("Designation:"+designation);
	System.out.println("-------------------");
}
public void update()
{
	if(salary>21000 && salary<28000)
	{
	   this.salary=((0.1*salary)+salary);
	System.out.println("Eid:"+eid);
	System.out.println("Ename:"+ename);
	System.out.println("Salary:"+salary);
	System.out.println("Designation:"+designation);
	System.out.println("-------------------");
	}
}
}
