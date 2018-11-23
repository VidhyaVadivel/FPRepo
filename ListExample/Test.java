package ListExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Employee emp[] = new Employee[5];
		Employee empl = new Employee();
		for(int i=0;i<emp.length;i++)
		{
			emp[i]=new Employee();
			
		}
		
		emp[0].setEid(101);
		emp[0].setEname("Vidhya");
		emp[0].setDesg("Trainee");
		
		emp[1].setEid(103);
		emp[1].setEname("Vaishahi");
		emp[1].setDesg("Clerk");
		
		emp[2].setEid(105);
		emp[2].setEname("Asvitha");
		emp[2].setDesg("Officer");
		
		emp[3].setEid(102);
		emp[3].setEname("Mugil");
		emp[3].setDesg("Manager");
		
		emp[4].setEid(104);
		emp[4].setEname("Ranjini");
		emp[4].setDesg("HR");
		
		
		
		
		System.out.println("1.sort by id   2.Sort by name  3.Sort by des");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice");
		int value = sc.nextInt();
		switch(value) {
		case 1:empl.setChoice(1);
			break;
		case 2:empl.setChoice(2);
			break;
		case 3:empl.setChoice(3);
			break;
		default:System.out.println("Invalid choice");
		}
	
		
		
		TreeSet<Employee> tt = new TreeSet();
		for(int i=0;i<emp.length;i++)
		{
			tt.add(emp[i]);
		}
		for(Employee e:tt)
		{
		System.out.println("Employee ID:"+e.getEid());
		System.out.println("Employee Name:"+e.getEname());
		System.out.println("Employee Designation:"+e.getDesg());
		System.out.println("***********************************");
		}
		
	}

}
