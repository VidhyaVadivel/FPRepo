
public class Employeel {
int eid;
String ename;
int age;
String designation;
int salary;

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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Employeel [eid=" + eid + ", ename=" + ename + ", age=" + age + ", designation=" + designation + ", salary="
			+ salary + "]";
}
void print(Address add)
{
	System.out.println("print"+add.toString());
}

}
