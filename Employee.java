
class Employee {
	
	public int empid;
	public String ename;
	String desg;
	int phno;
	String email;
	float sal;
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
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	/*@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", desg=" + desg + ", phno=" + phno + ", email="
				+ email + ", sal=" + sal + "]";
	}*/
	
	public void printDetails()
	{
		System.out.println("Employee Id:"+empid);
		System.out.println("Employee Name:"+ename);
		System.out.println("Designation:"+desg);
		System.out.println("Contact no:"+phno);
		System.out.println("Email Id:"+email);
		System.out.println("Salary:"+sal);
	}
	public void updateDetails() {
		if(sal>=21000 && sal<=28000) {
			System.out.println("Employee Id:"+empid);
			System.out.println("Employee Name:"+ename);
			System.out.println("Designation:"+desg);
			System.out.println("Contact no:"+phno);
			System.out.println("Email Id:"+email);
			System.out.println("Updated Salary="+((0.1*sal)+sal));
		}
	}
	
	
}
