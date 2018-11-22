
public class Emp {
int empid;
String ename;
String designation;
double basic;
double hra;
double salary;

public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
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
public double getSalary() {
	return salary;
}
public Emp(int empid, String ename, String designation, double basic) {
	super();
	this.empid = empid;
	this.ename = ename;
	this.designation = designation;
	this.basic = basic;
}

public Emp() {

}
void PrintDet()
{
	System.out.println("Empid:"+empid+"\tEname:"+ename+"\tDesignation:"+designation+"\tBasic:"+basic+"\tHRA:"+hra);
	
}

public static double CalculateHRA(double basic,String designation)
{
	double hra=0;
	if(designation=="manager")
		hra=(0.1*basic);
	if(designation=="officer")
		hra=(0.12*basic);
	if(designation=="clerk")
		hra=(0.05*basic);
	return hra;
	   
}

/*public static void EmployeeByDesg(String emp[],Emp e1[])
{

	for(int i=0;i<emp.length;i++)
	{
		for(int j=i+1;j<emp.length;j++)
		{
			if(emp[i]==emp[j]&& emp[j]!=null)
				emp[j]=null;
		}
		
	}
	
for(int i=0;i<emp.length;i++)
	{
		if(emp[i]!=null)
			{
			System.out.println("-----"+emp[i]+"----");
		for(int j=0;j<e1.length;j++)
		{
		if(emp[i]==e1[j].getDesignation())
		{
			System.out.println(e1[j].getEname());
		}
		}
			}
	}
}*/

public static void EmpDet(String ename, double salary)
{
	System.out.println("Ename:"+ename+"\tSalary:"+salary);
}

public static void EmpDet(String ename, String designation)
{
	System.out.println("Ename:"+ename+"\tDesignation:"+designation);
}
}

